window.addEventListener("DOMContentLoaded", function () {
    vetor = [15, 31, 45, 61];

    let number = parseInt(prompt("Digite um nro:"));  
    
    document.write(`<p>Vetor = ${vetor}</p>`);

    // a) A soma das idades
    const somaVetor = (vetor) =>
        // Reduce agrega um array, como group by no sql
        vetor.reduce((acumulador, elemento) => 
            acumulador + elemento, 0);

    this.document.write(`<p>A soma de todas idades é = ${somaVetor(vetor)}</p>`);


    // b) A média aritmética simples das idades
    const mediaVetor = (vetor) =>
        vetor.reduce((acumulador, elemento) =>
            acumulador + elemento, 0) / vetor.length;

    this.document.write(`<p>A média aritmética do vetor é = ${mediaVetor(vetor)}</p>`);

    // c) A maior idade
    const maiorIdade = (vetor) =>
        vetor.reduce((maior, elemento) =>
            elemento > maior ? elemento : maior); //OPERADOR TERNÁRIO: if elemento lido maior que o maio elemento encontrado, replace no elemento

    this.document.write(`<p>A maior idade é = ${maiorIdade(vetor)}</p>`);

    // d) As idades ímpares
    const idadesImpares = (vetor) =>
        // Every retorna um boolean verificando todo o array
        vetor.every(elemento =>
            elemento % 2 !==0
        );

    this.document.write(`<p>Todas as idades são ímpares = ${idadesImpares(vetor)}</p>`);

    // e) Verificar se todos são maiores de idade (idade >= 18); Retorno: true ou false
    const maioresIdade = (vetor) =>
        vetor.every(elemento =>
            elemento >= 18
        );

    this.document.write(`<p>Todos indivíduos são maiores de idade = ${maioresIdade(vetor)}</p>`);

    // f) Verificar se todas as idades são maiores ou iguais a um valor informado pelo usuário
    const maiorNroDigitado = (vetor) =>
        vetor.every(elemento =>
            elemento > number
        );

    this.document.write(`<p>Todas as idades são maiores que o número digitado = ${maiorNroDigitado(vetor)}</p>`);

    // g) Exibir todas as idades maiores ou iguais a determinada idade
    const arrayNrosMaiores = (vetor, x) =>
        // maiores = [];
        // Usando o filter, não preciso criar um novo vetor
        vetor.filter(elemento =>
            elemento > number
        );

    this.document.write(`<p>Idades maiores que o número digitado = ${arrayNrosMaiores(vetor, number)}</p>`);


    // h) A média das idades das pessoas com idades maiores ou iguais a determinada idade
    const mediaIdadeNrosMaiores = (vetor, x) =>{
        // maiores = [];
        // Usando o filter, não preciso criar um novo vetor
        const maiores = vetor.filter(elemento =>
            elemento > number
        );

        // Agora retorno os elementos filtrados, usando operadores ternários, somo e divido pelo qtd elementos
        return maiores.reduce((acumulador, elemento) => acumulador + elemento, 0) / maiores.length;
    };

    this.document.write(`<p>Média das idades maiores que o número digitado = ${mediaIdadeNrosMaiores(vetor, number)}</p>`);

    
})