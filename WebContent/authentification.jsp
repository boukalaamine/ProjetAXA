 <%@ include file="entete.jsp" %>
 		<div class="card-panel teal lighten-1"><center> <span class="white-text text-darken-2">
         	<h5><b> Branche Transport - AXA </b> <br> <br>
         		Connexion � l'espace personnel</h5></span></center>
        </div>
         
         <div class="row">
           <form action="AuthentificationServlet" method="post">
           <div class="col s6  offset-s3">
                <center>    <h5 class="light grey-text">Authentification</h5></center>
                <br>
            	<div class="card small"><br/>
                <center><span class="red-text text-darken-2">${erreur}</span></center>
                 <div class="row">
                 <div class="input-field col s6 offset-s3">
                 <i class="material-icons prefix">supervisor_account</i>     
                 	<input  id="mail" name="mail" type="text" required class="validate">
                 <label for="mail">Adresse mail</label>
                 </div> 
                 </div>
                
                <div class="row">
                <div class="input-field col s6 offset-s3">
                 <i class="material-icons prefix">lock</i>
                 <input id="password" name="password" type="password" required class="validate">
                 <label for="password">mot de passe</label>
                 </div>
                </div>  
				<br>
              <div class="row"> 
                  <div class="col s4  offset-s2">
                       <a href="http://localhost:8080/monProjet/addNewAuthorServlet">Cr�er un compte</a>
                  </div>
                  
                  <div class="col s4  offset-s1">
                       <button class="btn waves-effect waves-light" type="submit" name="action">Valider<i class="material-icons right">send</i></button>
                  </div>
                  <center><span class="blue-text text-darken-2">${answer}</span></center>
              </div>
             </div>
           </div>
         </div>
         </form>
               
<%@ include file="piedPage.jsp" %>