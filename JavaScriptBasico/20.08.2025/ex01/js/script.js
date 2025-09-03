nota1 = parseFloat(prompt("Digite a nota 1:"));
nota2 = parseFloat(prompt("Digite a nota 2:"));
notatotal = nota1 + nota2;
notafatante = (notatotal - 60)*-1

if (notatotal >= 60)
    // alert("U R Aproved!");
    alert(`U R aproved! Your rate was ${notatotal.toFixed(1)} points.`);
else
    alert(`Sorry bro, try again next time. U got ${notatotal.toFixed(1)} and u missed ${notafatante.toFixed(1)}`);