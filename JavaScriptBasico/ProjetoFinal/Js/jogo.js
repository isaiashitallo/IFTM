/*  
    jogo.js
    -------
    Aq tá a lógica do jogo:
    - tabuleiro
    - controle de rodadas
    - troca de jogador
    - timer
    - ranking
    - botões (pause, stop, restart)
*/

// --------------------------------------
// VARIÁVEIS PRINCIPAIS DO JOGO
// --------------------------------------

let tabuleiro = ["", "", "", "", "", "", "", "", ""]; 
/* 
    tabuleiro → guarda X ou O em cada posição
    motivo: é a forma mais simples de trabalhar com o estado do jogo
*/

let jogadorAtual = "X"; // Começa sempre com X
let jogoAtivo = false; // indica se o jogo está acontecendo
let pausaAtiva = false; // indica se está pausado
let temporizador = null; // id do setInterval
let tempoRestante = 0; // segundos
let numeroRodada = 0; // contador de jogadas

// Pegando elementos da tela
let textoUsuarioLogado = document.getElementById("usuarioLogado");
let textoTempo = document.getElementById("tempoExibicao");
let textoRodada = document.getElementById("rodadaExibicao");
let textoJogadorAtual = document.getElementById("jogadorAtualExibicao");

// Carregar usuário logado
let usuario = localStorage.getItem("usuarioLogado");

// Se não estiver logado, volta para login
if (!usuario) {
    alert("Você não está logado.");
    window.location.href = "index.html";
}

// Mostra o jogador logado na interface
textoUsuarioLogado.textContent = usuario;

// Jogador 1 recebe o nome automaticamente
document.getElementById("nomeJogador1").value = usuario;

// --------------------------------------
// FUNÇÃO PARA DEFINIR TEMPO POR DIFICULDADE
// --------------------------------------
function segundosPorDificuldade(dificuldade) {
    if (dificuldade === "facil") return 120;
    if (dificuldade === "medio") return 60;
    return 30; // dificil
}

// --------------------------------------
// FORMATAÇÃO DO TEMPO → MM:SS
// --------------------------------------
function formatarTempo(segundos) {
    let min = Math.floor(segundos / 60);
    let seg = segundos % 60;

    if (min < 10) min = "0" + min;
    if (seg < 10) seg = "0" + seg;

    return min + ":" + seg;
}

// --------------------------------------
// INICIAR CONTAGEM REGRESSIVA
// --------------------------------------
function iniciarTemporizador() {
    temporizador = setInterval(function () {
        if (!pausaAtiva) {
            tempoRestante--;
            textoTempo.textContent = formatarTempo(tempoRestante);

            if (tempoRestante <= 0) {
                clearInterval(temporizador);
                jogoAtivo = false;
                alert("Tempo esgotado!");
            }
        }
    }, 1000);
}

// --------------------------------------
// INICIAR JOGO
// --------------------------------------
document.getElementById("botaoIniciarJogo").onclick = function () {

    let nome1 = document.getElementById("nomeJogador1").value;
    let nome2 = document.getElementById("nomeJogador2").value;

    // Verifica se os nomes dos jogadores foram preenchidos
    if (nome1 === "" || nome2 === "") {
        alert("Preencha os dois nomes de jogadores.");
        return;
    }

    // Reset do tabuleiro
    tabuleiro = ["", "", "", "", "", "", "", "", ""];
    let celulas = document.querySelectorAll(".celula");

    for (let i = 0; i < celulas.length; i++) {
        celulas[i].textContent = "";
    }

    // Configurações iniciais
    jogadorAtual = "X";
    numeroRodada = 0;
    textoRodada.textContent = "0";
    textoJogadorAtual.textContent = nome1;

    jogoAtivo = true;
    pausaAtiva = false;

    // Configura o tempo pela dificuldade
    let dificuldade = document.getElementById("seletorDificuldade").value;
    tempoRestante = segundosPorDificuldade(dificuldade);
    textoTempo.textContent = formatarTempo(tempoRestante);

    // Reiniciar timer
    clearInterval(temporizador);
    iniciarTemporizador();

    alert("Jogo iniciado!");
};

// --------------------------------------
// CLICAR NO TABULEIRO
// --------------------------------------
let todasCelulas = document.querySelectorAll(".celula");

for (let i = 0; i < todasCelulas.length; i++) {

    todasCelulas[i].addEventListener("click", function () {

        // Só pode jogar se o jogo está ativo e não está pausado
        if (!jogoAtivo || pausaAtiva) return;

        let indice = this.getAttribute("data-indice");

        // Não deixa jogar em cima de algo já preenchido
        if (tabuleiro[indice] !== "") return;

        // Marca a jogada
        tabuleiro[indice] = jogadorAtual;
        this.textContent = jogadorAtual;

        numeroRodada++;
        textoRodada.textContent = numeroRodada;

        let resultado = verificarVencedor();

        if (resultado) {
            jogoAtivo = false;
            clearInterval(temporizador);

            if (resultado === "empate") {
                alert("O jogo terminou empatado!");
            } else {
                let vencedor =
                    jogadorAtual === "X"
                        ? document.getElementById("nomeJogador1").value
                        : document.getElementById("nomeJogador2").value;

                alert("Vencedor: " + vencedor);
                salvarRanking(vencedor, tempoRestante);
            }
            return;
        }

        // Troca o jogador
        if (jogadorAtual === "X") {
            jogadorAtual = "O";
            textoJogadorAtual.textContent = document.getElementById("nomeJogador2").value;
        } else {
            jogadorAtual = "X";
            textoJogadorAtual.textContent = document.getElementById("nomeJogador1").value;
        }
    });
}

// --------------------------------------
// CHECAR VENCEDOR
// --------------------------------------
function verificarVencedor() {

    let combinacoes = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];

    for (let i = 0; i < combinacoes.length; i++) {

        let a = combinacoes[i][0];
        let b = combinacoes[i][1];
        let c = combinacoes[i][2];

        if (
            tabuleiro[a] !== "" &&
            tabuleiro[a] === tabuleiro[b] &&
            tabuleiro[b] === tabuleiro[c]
        ) {
            return tabuleiro[a];
        }
    }

    // Checa empate
    let completo = true;

    for (let i = 0; i < tabuleiro.length; i++) {
        if (tabuleiro[i] === "") {
            completo = false;
            break;
        }
    }

    if (completo) return "empate";

    return null;
}

// --------------------------------------
// SALVAR RANKING
// --------------------------------------
function salvarRanking(jogador, tempo) {
    let dificuldade = document.getElementById("seletorDificuldade").value;
    let chave = "ranking_" + dificuldade;

    let lista = localStorage.getItem(chave);

    if (lista) {
        lista = JSON.parse(lista);
    } else {
        lista = [];
    }

    lista.push({ jogador: jogador, tempoRestante: tempo });

    localStorage.setItem(chave, JSON.stringify(lista));
}

// --------------------------------------
// BOTÕES SECUNDÁRIOS
// --------------------------------------

document.getElementById("botaoPausar").onclick = function () {
    pausaAtiva = !pausaAtiva;
    alert(pausaAtiva ? "Jogo pausado." : "Jogo retomado.");
};

document.getElementById("botaoParar").onclick = function () {
    jogoAtivo = false;
    clearInterval(temporizador);
    alert("Jogo parado.");
};

document.getElementById("botaoReiniciar").onclick = function () {
    jogoAtivo = false;
    clearInterval(temporizador);

    tabuleiro = ["", "", "", "", "", "", "", "", ""];
    let celulas = document.querySelectorAll(".celula");

    for (let i = 0; i < celulas.length; i++) {
        celulas[i].textContent = "";
    }

    pausaAtiva = false;
    numeroRodada = 0;
    textoRodada.textContent = "0";
    textoJogadorAtual.textContent = "-";

    alert("Jogo reiniciado.");
};

document.getElementById("botaoSair").onclick = function () {
    localStorage.removeItem("usuarioLogado");
    window.location.href = "index.html";
};

// --------------------------------------
// VER RANKING
// --------------------------------------
document.getElementById("botaoVerRanking").onclick = function () {

    let dificuldade = document.getElementById("seletorDificuldade").value;
    let chave = "ranking_" + dificuldade;

    let registro = localStorage.getItem(chave);

    if (!registro) {
        alert("Nenhum ranking salvo ainda.");
        return;
    }

    let lista = JSON.parse(registro);

    let texto = "Ranking (" + dificuldade + "):\n\n";

    for (let i = 0; i < lista.length; i++) {
        texto +=
            (i + 1) +
            "º - " +
            lista[i].jogador +
            " | Tempo restante: " +
            lista[i].tempoRestante +
            "s\n";
    }

    alert(texto);
};
