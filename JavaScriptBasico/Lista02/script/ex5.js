// Coleta de dados
qtd = parseInt(prompt("Quantos passageiros?"));
nomes = [];
idades = [];
somaIdade = 0;

for ( i = 0; i < qtd; i++) {
    const nome = prompt(`Nome do passageiro ${i + 1}:`);
    const idade = parseInt(prompt(`Idade de ${nome}:`));
    nomes.push(nome);
    idades.push(idade);
    somaIdade += idade;
}

// Média de idades
const media = somaIdade / qtd;

// Sorteio de um nome
const sorteado = nomes[Math.floor(Math.random() * nomes.length)];

// Exibição
document.write(`<p>Idade média dos passageiros: ${media.toFixed(1)}</p>`);
document.write(`<p>Ganhador do almoço: ${sorteado}</p>`);
