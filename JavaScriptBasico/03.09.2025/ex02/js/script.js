vet = [];

for (i=1; i<60; i++)
    vet[i-1] = i;

for (i=0; i<6; i++) {
    indiceVetor = Math.floor(Math.random()*vet.length);
    nroSorte = vet[indiceVetor];
    console.log(nroSorte);
    // removendo nro sorteado
    vet.splice(indiceVetor, 1);
}