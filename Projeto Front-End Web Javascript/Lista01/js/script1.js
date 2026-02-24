window.addEventListener("DOMContentLoaded", function () {
    sumAges = (vet) => {
        sum = 0;
        for (i = 0; i < vet.length; i++)
            sum += vet[i];
        return sum;
    }
    vetAges = [10, 21, 31, 40];
    document.write(`<p>Soma das idades = ${sumAges(vetAges)}</p>`);

    let number = parseInt(prompt("Digite um nro:"));    
// a) A média aritmética simples das idades




// b) A maior idade
    biggerAge = (vet) => {
        bigger = 0;
        for (i = 0; i < vet.length; i++)
            if (vet[i] > bigger)
                bigger = vet[i];
        return bigger;
    }
    document.write(`<p>A maior idade = ${biggerAge(vetAges)}</p>`);


// c) As idades ímpares
    impares = (vet) => {
        const even = [];
        for (let i = 0; i < vet.length; i++)
            if (vet[i] % 2 !== 0)
                even.push(vet[i]);
        return even;
    }
    document.write(`<p>Idades Ímpares = ${impares(vetAges)}</p>`);
    


// d) Verificar se todos são maiores de idade (idade >= 18); Retorno: true ou false
    maiores = (vet) => {
        for (let i = 0; i < vet.length; i++)
            if (vet[i] < 18)
                return false;
        return true;
    }
    this.document.write(`<p>Maiores que 18 =  ${maiores(vetAges)}</p>`);

// e) Verificar se todas as idades são maiores ou iguais a um valor informado pelo usuário
    biggerThanUserNro = (vet) => {

        for (let i = 0; i < vet.length; i++) {
            if (vet[i] < number) {
                return false;
            }
        }
        return true;
    }
    this.document.write(`<p>Maiores que nro do usuário =  ${biggerThanUserNro(vetAges)}</p>`);


// f) Exibir todas as idades maiores ou iguais a determinada idade
    verificaIdades = (vet) => {
        // let number2 = parseInt(prompt("Digite um nro:"));
        const maiores = [];

        for(let i = 0; i < vet.length; i++) 
            if(vet[i] >= number)
                maiores.push(vet[i]);
            
        return maiores;
    }
    this.document.write(`<p>Idades maiores que o nro digitado: ${verificaIdades(vetAges)}</p>`)


// g) A média das idades das pessoas com idades maiores ou iguais a determinada idade

    mediaIdadesMaiores = (vet) => {
        // let number2 = parseInt(prompt("Digite um nro:"));
        const maiores = [];
        let soma = 0;

        for(let i = 0; i < vet.length; i++) 
            if(vet[i] >= number){
                maiores.push(vet[i])
                soma += vet[i];
            }
        return soma / maiores.length;
    }
    this.document.write(`<p>A média das idades maiores que o nro digitado: ${mediaIdadesMaiores(vetAges)}</p>`)

})