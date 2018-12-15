$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "Como um usuario, gostaria de realizar o login no TestLink",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Positivo",
  "description": "",
  "id": "login;login-positivo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Jose acessa o TestLink",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "preenche o usuario e senha corretos",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "visualiza a home interna",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.Jose_acessa_o_TestLink()"
});
formatter.result({
  "duration": 6350895752,
  "status": "passed"
});
formatter.match({
  "location": "Login.preenche_o_usuario_e_senha_corretos()"
});
formatter.result({
  "duration": 6259086398,
  "status": "passed"
});
formatter.match({
  "location": "Login.visualiza_a_home_interna()"
});
formatter.result({
  "duration": 3382226788,
  "status": "passed"
});
});