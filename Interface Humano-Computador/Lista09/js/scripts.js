
const form = document.getElementById("formConsulta");

const campoAutor = document.getElementById("autor");
const campoTitulo = document.getElementById("titulo");
const campoIsbn = document.getElementById("isbn");

const mensagemErro = document.getElementById("mensagemErro");
const status = document.getElementById("status");
const resultados = document.getElementById("resultados");

// Exs
const obras = [
    {
        autor: "Machado de Assis",
        titulo: "Dom Casmurro",
        isbn: "9788535910663"
    },
    {
        autor: "Clarice Lispector",
        titulo: "A Hora da Estrela",
        isbn: "9788532508126"
    },
    {
        autor: "J. R. R. Tolkien",
        titulo: "O Senhor dos Anéis",
        isbn: "9788595084759"
    },
    {
        autor: "George Orwell",
        titulo: "1984",
        isbn: "9788520935067"
    },
    {
        autor: "Fiódor Dostoiévski",
        titulo: "Crime e Castigo",
        isbn: "9788520935067"
    },
    {
        autor: "Jane Austen",
        titulo: "Orgulho e Preconceito",
        isbn: "9788535910663"
    },
    {
        autor: "Gabriel García Márquez",
        titulo: "Cem Anos de Solidão",
        isbn: "9788535910663"
    },
    {
        autor: "Harper Lee",
        titulo: "O Sol é para Todos",
        isbn: "9788535910665"
    },
    {
        autor: "Herman Melville",
        titulo: "Moby Dick",
        isbn: "9788535910663"
    }
];

function normalizar(texto) {
    return texto.trim().normalize("NFD").replace(/[\u0300-\u036f]/g, "").toLowerCase();
}

function normalizarIsbn(texto) {
    return texto.replace(/[^0-9Xx]/g, "").toUpperCase();
}

function mostrarErro(msg) {
    mensagemErro.textContent = msg;
    mensagemErro.hidden = false; //usa o hidden do css
}

function limparErro() {
    mensagemErro.textContent = "";
    mensagemErro.hidden = true; //retorna estado oculto
}

function limparResultados() {
    resultados.replaceChildren(); //limpa os filhos do elemento
}

function exibirResultados(lista) {
    limparResultados(); //chama a function de cima

    lista.forEach((obra) => {
        const item = document.createElement("li"); //cria item
        const titulo = document.createElement("strong");//cria o titulo

        titulo.textContent = obra.titulo;

        const detalhes = document.createElement("p");//detalhhes
        detalhes.textContent =
            `Autor: ${obra.autor} | ISBN: ${obra.isbn}`;

        item.append(titulo, detalhes);
        resultados.appendChild(item);
    });
}



form.addEventListener("submit", function (evento) {
    evento.preventDefault();
    limparErro();
    limparResultados();

    const autor = campoAutor.value.trim();
    const titulo = campoTitulo.value.trim();
    const isbn = campoIsbn.value.trim();

    // Exige pelo menos um criterio
    if (!autor && !titulo && !isbn) {
        mostrarErro(
            "Preencha pelo menos um campo para realizar a pesquisa."
        );
        status.textContent = "A pesquisa não foi realizada.";
        campoAutor.focus();
        return;
    }

    // Pesquisa c correspondência parcial
    // qnd mais de um campo é preenchido, todos devem corresponder
    const encontrados = obras.filter((obra) => {
        const correspondeAutor =
            !autor || normalizar(obra.autor).includes(normalizar(autor));

        const correspondeTitulo =
            !titulo || normalizar(obra.titulo).includes(normalizar(titulo));

        const correspondeIsbn =
            !isbn ||
            normalizarIsbn(obra.isbn).includes(normalizarIsbn(isbn));

        return correspondeAutor && correspondeTitulo && correspondeIsbn;
    });

    if (encontrados.length === 0) {
        status.textContent =
            "Nenhuma obra encontrada. Confira os dados ou tente outros critérios.";
        return;
    }

    exibirResultados(encontrados);

    status.textContent =
        `${encontrados.length} obra(s) encontrada(s).`;
});

//reseta
form.addEventListener("reset", function () {
    limparErro();
    limparResultados();
    status.textContent =
        "Os campos foram limpos. Preencha pelo menos um campo para começar.";
});

// Remove a mensagem de erro assim que o usuário começa a corrigir.
[campoAutor, campoTitulo, campoIsbn].forEach((campo) => {
    campo.addEventListener("input", limparErro);
});
