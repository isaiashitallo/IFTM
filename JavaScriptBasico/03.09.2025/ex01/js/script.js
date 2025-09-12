vet = [];

for (i=0; i<20; i++)
    vet[i] = 10*(i+1);


indice = prompt("Vc quer remover o elemento de qual índice?")

// qual indice
console.log(indice);

// e elemento removido
vet.splice(indice, 1)

// vetor atualizado

console.log(vet);
// alert(vet);