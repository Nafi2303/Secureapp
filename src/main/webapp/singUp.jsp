<!DOCTYPE html>
<html lang='en'>

<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Sign Up</title>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    <link rel='stylesheet' href='./public/style.css'>
</head>

<body>

    <body>
        <section>
            <div class="form-box">
                    <form>
                        <h2>S'enrégistrer</h2>
                        <div class="inputbox"> <ion-icon name="mail-outline"></ion-icon> <input type="email" name = "email" required>
                            <label>Email </label>
                        </div>
                        
                        <div class="inputbox"> <ion-icon name="lock-closed-outline"></ion-icon> <input type="password" name="pwd"
                                required> <label>Password </label> </div>
                                                
                       <div class="inputbox"> <label for="state"></label>
                    <select name="state" id="state" required>
                        <option value="active">Active</option>
                        <option value="desactive">Désactivé</option>
                    </select>
                    </div>
                                
                        <div class="forget"> <label><input type="checkbox">J'accepte les termes & conditions</label> <a href="./WEB-INF/jsp/welcome.jsp"></a> </div> <button type="submit">Soumettre</button>
                        <div class="register">
                            <p> Vous avez déjà un compte ? <a href="./index.jsp">Se connecter</a></p>
                        </div>
                    </form>
                </div>
        </section> 
    </body>
</body>

</html>