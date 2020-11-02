const texto = `
123456
p4ulo
QUASE123!
#0pA1
#essaSenhaEGrande1234

#OpA1?
Foi123!
`;

console.log(texto.match(/^.{6,20}$/gm));
console.log(texto.match(/^(?=.*[A-Z]).{6,20}$/gm))
console.log(texto.match(/^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@#$%!^&*._]).{6,20}$/gm))