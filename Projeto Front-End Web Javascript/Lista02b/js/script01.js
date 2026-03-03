import {tabela} from "./tabela.js";

window.addEventListener("DOMContentLoaded", function() {
    // 1. Exibir o nome e a idade de todas as pessoas maiores de idade
    const maioresIdade = (t) =>  // o 't' é uma abstração, como o 'i' dos laços
        t.filter(t => t.Idade >= 18);

    const resultado = maioresIdade(tabela)
        .map(p => `${p.NomeCompleto} - ${p.Idade} anos`).join("<br>");

    document.write(`<p>Pessoas maiores de idade:<br>${resultado}<br></p>`);


    // 2. Exibir os nomes de todas as pessoas do sexo masculino
    const masculino = (m) =>
        m.filter(m => m.Sexo === "M");

    const mascResult = masculino(tabela)
        .map(s => `${s.NomeCompleto}`).join("<br>");

    this.document.write(`<p><br>Sexo masculino:<br>${mascResult}<\p>`);

    // 3. Exibir os dados da pessoa com o maior salario
    // usar reduce
    const maiorSalario = (tabela) => {
        return tabela.reduce((maior, atual) => {
            if (atual.Salario > maior.Salario) {
                return atual;
            } else {
                return maior;
            }
        }, tabela[0]);
    }

    const resultSalario = maiorSalario(tabela);

    document.write(`
        <p>
            Maior salário:<br>
            ${resultSalario.NomeCompleto} - R$ ${resultSalario.Salario}
        </p>
    `);


    // 4. Há alguma mulher que ganha acima de 5000,00?
    const mulher5k = 
        tabela.some(pessoa =>
            pessoa.Sexo === 'F' && pessoa.Salario > 5000
    );

    this.document.write(`Há mulher ganhando acima de 5mil? ${mulher5k}`);

    
    
    // 5. Media dos salarios dos homens e das mulheres
    const mediaSalariosPorSexo = (tabela, sexo) => {
    const pessoas = tabela.filter(p => p.Sexo === sexo);

    if (pessoas.length === 0) return 0;

    const soma = pessoas.reduce((total, p) => {
            return total + p.Salario;
        }, 0);

        return soma / pessoas.length;
    };

    const mediaHomens = mediaSalariosPorSexo(tabela, "M");
    const mediaMulheres = mediaSalariosPorSexo(tabela, "F");

    document.write(`
        <p>
            Média salários homens: R$ ${mediaHomens.toFixed(2)}<br>
            Média salários mulheres: R$ ${mediaMulheres.toFixed(2)}
        </p>
    `);

})