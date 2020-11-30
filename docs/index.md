### LoginService

Classe permettant de générer un Login depuis une liste de login initiaux
```markdown
String[] passwords = {"toto"}
LoginService ls = new LoginService(passwords);
```
###Les Méthodes

.add(String) ajoute un login dans la liste des logins existants si celui ci n'existe pas déjà
```markdown
ls.add("Axel");
```

.loginExists(String) renvoie si le login existe ou non
```markdown
ls.loginExists("Axel");
```

.findAllLoginsStartingWith(String) renvoie tous les logins commençant par le string en paramètre
```markdown
ls.findAllLoginsStartingWith("A");
```

.findAllLogins() renvoie la liste de tous les logins existants
```markdown
ls.findAllLogins();
```