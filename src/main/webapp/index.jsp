<!DOCTYPE html>
<html lang='en'>

<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Login</title>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    <link rel='stylesheet' href='./public/style.css'>
</head>

<body>

    <body>
        <section>
            <div class="form-box">
                    <form action="login" method="post">
                        <h2>Se connecter</h2>
                        <div class="inputbox"> <ion-icon name="mail-outline"></ion-icon> <input type="email" name="email" required>
                            <label>Email</label>
                        </div>
                        <div class="inputbox"> <ion-icon name="lock-closed-outline"></ion-icon> <input type="password" name="password"
                                required> <label>Password</label> </div>
                        <div class="forget"> <label><input type="checkbox">Remember Me</label> <a href="#">Mot de passe oublié ?</a> </div> <button>Se connecter</button>
                        <div class="register">
                            <p>Vous n'avez pas de compte? <a href="./singUp.jsp">S'enregistrer</a></p>
                        </div>
                    </form>
                </div>
            </div>
        </section> 
    </body>
</body>

</html>