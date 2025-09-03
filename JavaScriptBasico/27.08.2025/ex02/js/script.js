nome = prompt("Enter your name:", "Isaias Hitallo Durante Amaral");

// option = prompt("[MENU]\n"+
//     "\n[1] UPPERCASE"+
//     "\n[2] lowercase"+
//     "\n[3] First Letter Upper"+
//     "\n[4] Forename Upper and Surname lower"+
//     "\n[5] Replace Forename for another"+
//     "\n[6] Forename and Surname`s first letter upper and concatenated"+
//     "\n[7] Print the 3 firsts letters"
// );
opcao = prompt("[MENU]"+ 
    "\n[1] Letras Maiúsculas"+
    "\n[2] Letras Minúsculas"+
    "\n[3] Primeira letra do primeiro nome maiúscula "+
    "\n[4] Primeiro nome "+
    "\n[5] Primeiro nome maiúsculo e último nome minúsculo"+
    "\n[6] Substitua o primeiro nome por um novo nome "+
    "\n[7] Primeira letra do primeiro nome e do ultimo nome maiusculas concatenadas"+
    "\n[8] Exiba as 3 primeiras letras do nome ");

//Exemplos:
//nome = "Wilton de Paula Filho"
// [1] "WILTON DE PAULA FILHO"
// [2] "wilton de paula filho"
// [3] "W"
// [4] "Wilton"
// [5] "WILTON filho"
// [6] Qual o novo nome? "Joao" -> "Joao de Paula Filho"
// [7] "WF"
// [8] "Wil"

// tamanho = nome.length();
cas04 = nome.indexOf(" ");
cas0501 = nome.substr(0,cas04);
cas0502 = nome.lastIndexOf(" ");

 

switch (opcao) {
    case "1":
        document.write(`<p>${nome.toUpperCase()}</p>`);
        break;  
    case "2":
        document.write(`<p>${nome.toLowerCase()}</p>`);
        break;
    case "3":
        document.write(`<p>${nome.at().toUpperCase()}</p>`);
        break;
    case "4":
        // document.write(`<p>${nome.substr(0,cas04)}</p>`);
        document.write(`<p>${nome.split(" ")[0]}</p>`);
        break;
    case "5":
        document.write(`<p>${cas0501.toUpperCase()} ${nome.substr(cas0502,100).toLowerCase()}</p>`);
        break;
    case "6":
        document.write(`<p>${nome.toLowercase()}</p>`);
        break;
    case "7":
        document.write(`<p>${nome.toLowercase()}</p>`);
        break;
    case "8":
        document.write(`<p>${nome.substr(0, 3)}</p>`);
        break;
}