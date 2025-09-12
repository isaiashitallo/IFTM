options = ["pedra", "papel", "tesoura"];

document.write("<h1>Resultados:</h1>");

indicePlayer1 = Math.floor(Math.random()*3); //draw 0 to 2
document.write(`<p>Player 1: ${options[indicePlayer1]}</p>`);

indicePlayer2 = Math.floor(Math.random()*3); //draw 0 to 2
document.write(`<p>Player 2: ${options[indicePlayer2]}</p>`);

if(indicePlayer1 == indicePlayer2)
    document.write("Empate");
    else if (indicePlayer1 == 0) { //player 1 has chosen rock
        if (indicePlayer2 == 1) //player 2 has chosen papper
            document.write("Jogador 2 ganhou!");
        else document.write("Jogador 1 ganhou!");
    } else if (indicePlayer1 == 2) //player 1 has chosen scissors
        if (indicePlayer2 == 1) //player 2 has chosen papper
            document.write("Jogador 1 ganhou!");
        else document.write("Jogador 2 ganhou");
        else if (indicePlayer2 == 0) { //player 1 has chosen rock
        if (indicePlayer1 == 1)
            document.write("Jogador 1 ganhou!");
        else document.write("Jogador 2 ganhou!");
    } else if (indicePlayer2 == 2)
        if (indicePlayer1 == 1)
            document.write("Jogador 2 ganhou!");
        else document.write("Jogador 1 ganhou");