// ETAPA 1: Criação do vetor com números de 1 a 27
let vetorCartas = [];
for (let i = 1; i <= 27; i++) {
    vetorCartas.push(i);
}
console.log("vetorCartas", vetorCartas);

// ETAPA 2: Criar vetor com 4 pares aleatórios do vetor anterior
function gerarPares() {
    let cartasSelecionadas = [];
    while (cartasSelecionadas.length < 4) {
        let numero = Math.floor(Math.random() * 27) + 1;
        if (!cartasSelecionadas.includes(numero)) {
            cartasSelecionadas.push(numero);
        }
    }

    // duplicar os pares
    let vetorPares = [];
    cartasSelecionadas.forEach(num => {
        vetorPares.push(num, num);
    });

    console.log("Etapa 2 - Pares selecionados:", vetorPares);
    return vetorPares;
}

// ETAPA 3: Embaralhar o vetor de pares
function embaralhar(vetor) {
    for (let i = vetor.length - 1; i > 0; i--) {
        let j = Math.floor(Math.random() * (i + 1));
        [vetor[i], vetor[j]] = [vetor[j], vetor[i]];
    }
    console.log("Etapa 3 - Vetor embaralhado:", vetor);
    return vetor;
}

// ETAPA 4: Exibir imagens correspondentes na página
function exibirCartas(vetor) {
    let tabuleiro = document.getElementById("tabuleiro");
    tabuleiro.innerHTML = ""; // limpa antes de mostrar
    vetor.forEach(num => {
        let img = document.createElement("img");
        img.src = `img/carta${num}.png`;
        img.alt = `Carta ${num}`;
        tabuleiro.appendChild(img);
    });
}

// Função principal para iniciar o jogo (etapas 1 a 4)
function iniciarJogo() {
    let pares = gerarPares();
    let embaralhados = embaralhar(pares);
    exibirCartas(embaralhados);
}
