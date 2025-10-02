// cand1 = document.getElementById("imgCand1"); //pegando a imagem do candidato 1
// cand2 = document.getElementById("imgCand2"); //pegando a imagem do candidato 2
// cand3 = document.getElementById("imgCand3"); //pegando a imagem do candidato 3
// cand4 = document.getElementById("imgCand4"); //pegando a imagem do candidato 4

// //criar ação ao clicar na img para contar e alterar o votosCandidatos

// var votosCandidatos = [0,0,0,0]; //vetor para armazenar os votos de cada candidato

// document.getElementById("votosCand1").innerHTML = votosCandidatos[0];
// document.getElementById("votosCand2").innerHTML = votosCandidatos[1];
// document.getElementById("votosCand3").innerHTML = votosCandidatos[2];
// document.getElementById("votosCand4").innerHTML = votosCandidatos[3];

// cand1.addEventListener("click", function() {incrementaVoto(1)});
// cand2.addEventListener("click", function() {incrementaVoto(2)});
// cand3.addEventListener("click", function() {incrementaVoto(3)});
// cand4.addEventListener("click", function() {incrementaVoto(4)});

// function incrementaVoto() {
//     votosCandidatos[nroCandidato-1] = votosCandidatos[nroCandidato-1] + 1;
//     document.getElementById(`votosCand${nroCandidato}`).innerHTML = votosCandidatos[nroCandidato-1];
 
//     // document.getElementById("votosCand").innerHTML = votosCandidatos[0];
// }


// Array para armazenar os votos de cada candidato
let votos = [0, 0, 0, 0];

// Seleciona todas as imagens dos candidatos
const imagens = document.querySelectorAll(".card img");

// Seleciona todos os spans onde os votos serão exibidos
const spansVotos = document.querySelectorAll(".card .votos span");

// Inicializa os spans com 0
spansVotos.forEach(span => span.textContent = 0);

// Adiciona evento de clique em cada imagem
imagens.forEach((img, index) => {
    img.addEventListener("click", () => {
        votos[index]++; // incrementa voto do candidato clicado
        spansVotos[index].textContent = votos[index]; // atualiza na tela
    });
});
