const texto = `
Os e-mails dos convidados são:
    - fulano@p4ulo.com.br
    - xico@gmail.com
    - maria_silva@registro.br
    - rafa.sampaio@yahoo.com
    - fulano+de+tal@escola.ninja.br
`;

console.log(texto.match(/\S+@\w+\.\w{2,6}(\.\w{2})?/g));