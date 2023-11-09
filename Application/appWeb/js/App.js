const form = document.querySelector("form");
const Gnome = document.querySelector("#nickname");
const Gemail = document.querySelector("#email");
const Gsenha = document.querySelector("#senha");

function conect() {
  fetch("http://localhost:8080/database/enviar", {
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
    method: "POST",
    body: JSON.stringify({
      email: Gemail.value,
      nome: Gnome.value,
      senha: Gsenha.value,
    }),
  }).then((Promise) => {
    if(Promise.status == 201){
        window.alert("Cadastro feito com sucesso");
    }
    else{
        if(Promise.status == 500){
            window.alert("Você inseriu algum dado repetido")
        }
        if(Promise.status == 404){
          window.alert("A aplicação está em indisponibilidade")
        }
    }
  });
}
form.addEventListener("submit", (event) => {
  event.preventDefault();
  conect();
});

function limpar() {
  Gnome.value = "";
  Gemail.value = "";
  Gsenha.value = "";
}
