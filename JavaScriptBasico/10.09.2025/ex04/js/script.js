vetor = [10,20,30,40,50]

//imprimindo vetor

//for
for (i=0; i<vetor.length; i++)
    console.log(vetor[i]);

//while
i=0;
while (i<=vetor.length) {
    console.log(vetor[i++]);
}

//for ... in
for (i in vetor)
    console.log(vetor[i]);