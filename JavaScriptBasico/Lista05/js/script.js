// Contadores individuais
let votos1 = 0;
let votos2 = 0;
let votos3 = 0;
let votos4 = 0;

// Pega os spans dos votos
let span1 = document.querySelectorAll(".card .votos span")[0];
let span2 = document.querySelectorAll(".card .votos span")[1];
let span3 = document.querySelectorAll(".card .votos span")[2];
let span4 = document.querySelectorAll(".card .votos span")[3];

// Inicia os valores como 0
span1.textContent = votos1;
span2.textContent = votos2;
span3.textContent = votos3;
span4.textContent = votos4;

// Pega as imagens
let img1 = document.getElementById("imgCand1");
let img2 = document.getElementById("imgCand2");
let img3 = document.getElementById("imgCand3");
let img4 = document.getElementById("imgCand4");

// Adiciona eventos de clique em cada imagem
img1.addEventListener("click", function() {
    votos1++;
    span1.textContent = votos1;
});

img2.addEventListener("click", function() {
    votos2++;
    span2.textContent = votos2;
});

img3.addEventListener("click", function() {
    votos3++;
    span3.textContent = votos3;
});

img4.addEventListener("click", function() {
    votos4++;
    span4.textContent = votos4;
});
