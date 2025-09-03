nota1 = parseFloat(prompt("Digite sua nota do 1° bimestre:"));
nota2 = parseFloat(prompt("Digite sua nota do 2° bimestre:"));
notaTotal= nota1 + nota2;
resto = 60 - notaTotal;

if(notaTotal>= 60) 
    alert(`Parabens você passou!! Você tirou ${notaTotal.toFixed(1)} pontos`); 
//.toFixed(n)define o nro de casa apos o ".", nro retorna string
else 
    alert(`Infelizmente você reprovou. Você tirou ${notaTotal.toFixed(1)} pontos, ficaram faltando ${resto.toFixed(1)} pontos `);