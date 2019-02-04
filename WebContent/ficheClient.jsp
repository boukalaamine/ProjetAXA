 <%@ include file="entete.jsp" %>
 		<div class="card-panel teal lighten-1"><center> <span class="white-text text-darken-2">
         	<h5><b> Branche Transport - AXA </b> <br> <br>
         		Informations sur le Projet</h5></span></center>
        </div>
         
         <div class="row">
           <form action="ficheClientServlet" method="post">
           <div class="col s6  offset-s3">
                <center>    <h5 class="light grey-text">Informations sur la fiche client</h5></center>
                <br>
            	<div class="card small"><br/>
                <center><span class="red-text text-darken-2">${erreur}</span></center>
                 <div class="row">
                 <div class="input-field col s10 offset-s1">
                 <span>N° Fiche client</span>     
                 	<input  id="numClient" name="numClient" type="number" required class="validate" required>
                 </div> 
                 </div>
                
                <div class="row">
                <div class="input-field col s10 offset-s1">
                 <span>Date d'effet</span>
      	  <input type="date" name="dateEffet" id="dateEffet"  class="datepicker" class="validate" required>
                 </div>
                </div>  
				<br>
				<br>
				<br>
              <div class="row">                   
                  <div class="col s4  offset-s4">
                       <button class="btn waves-effect waves-light" type="submit" name="action">Continuer<i class="material-icons right">send</i></button>
                  </div>
                  <center><span class="blue-text text-darken-2">${answer}</span></center>
              </div>
             </div>
           </div>
         </div>
         </form>
            