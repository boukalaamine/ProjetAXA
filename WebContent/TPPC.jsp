 <%@ include file="entete.jsp" %>
 		<div class="card-panel teal lighten-1"><center> <span class="white-text text-darken-2">
         	<h5><b> Branche Transport - AXA</b> <br> <br>
         		Réalisation d'un projet d'assurance</h5></span></center>
        </div>
        
<br>        
      <h5>Informations sur le client</h5>
<hr>
<br> 
        <div class="row">
        <form action="/monProjet/ProjetTPPCServlet" method="post">
        
        <div class="input-field col s4">
          <input name = "nomClient" id="nomClient" type="text" class="validate"  >
          <label for="nomClient">
          <span>Nom du client</span>
          </label>
        </div>
        
        <div class="input-field col s4">
          <input name = "adresseClient" id="adresseClient" type="text" class="validate"  >
          <label for="adresseClient">Adresse</label>
        </div>
      </div>

<div class="row">
        <div class="input-field col s8 ">
          <input name = "numeroContrat" id="numeroContrat" type="text" class="validate"  >
          <label for="numeroContrat">Numéro de contrat </label>
        </div>
</div>

<div class="row">
        <div class="input-field col s8 ">
          <input id="activite" name = "activite" type="text" class="validate">
          <label for="activite"> Activité de l'assuré</label>
        </div>
</div>


<div class="row">
			<label>
		        	<input type="checkbox" id="assureAdditionnel" name= "assureAdditionnel" class="filled-in" onchange="toggleAssureAdditionnel()"/>
        			<span>Assuré additionnel</span>
			</label>
</div>

<div class="row" id="divAssureAdditionnel" style="display:none;">
			<label>
			            <input id="nomAssureAdditionnel" name = "nomAssureAdditionnel" type="number" data-length="10" >
        			<span>Nom de l'Assuré additionnel</span>
			</label>
</div>



<h5>Informations sur les garanties</h5>
<hr>
<br>

 <div class="row">
	<div class="col s4 offset-s0">
		
		<div class="row">
			<label>
		        	<input type="checkbox" id = "animauxVivants" name =  "animauxVivants" class="filled-in" />
        			<span>Animaux vivants</span>
			</label>
		</div>
		
		<div class="row">
			<label>
		        	<input type="checkbox" id="frigo" name= "frigo" class="filled-in" />
        			<span>Frigo</span>
			</label>
		</div>
		
		<div class="row">
			<label>
		        	<input type="checkbox" id="expositions" name= "expositions" class="filled-in" onchange="toggleExp()"/>
        			<span>Expositions</span>
			</label>
		</div>
		
    	</div>
	<div class="col s4 offset-s1">
			
	    <div class="row">
			<label>
		        	<input type="checkbox" id = "vehiculesEtRemorques" name =  "vehiculesEtRemorques" class="filled-in" />
        			<span>Véhicules et Remorques</span>
			</label>
	    </div>
	    
	    <div class="row">
			<label>
		        	<input type="checkbox" id = "citerne" name =  "citerne" class="filled-in" />
        			<span>Citerne</span>
			</label>
		</div>
		
		<div class="row" id="divNbExpo" style="display:none;">
			<label>
			            <input id="nombreExpositions" name = "nombreExpositions" type="number" data-length="10" >
        			<span>Nombre d'expositions</span>
			</label>
	    </div>
		
	    
	</div>
</div>

    
      <h5>Informations sur l'agent</h5>
<hr>
<br> 
        <div class="row">
        <div class="input-field col s4">
          <input id="nomAgent" name ="nomAgent" type="text" class="validate"  >
          <label for="first_name">Nom de l'agent</label>
        </div>
        <div class="input-field col s4">
          <input id="adresseAgent" type="text" class="validate"  >
          <label for="last_name">Adresse de l'agent</label>
        </div>
      </div>


      <h5>Fonctionnement du contrat</h5>
<hr>
<br> 


<div class="row">
		<div class="row">
	<div class="col s3">	
	  
      <label>
        <input name="typeContrat" id = "contratAnnuel" type="radio" value="contratAnnuel" checked onchange = "toggleDateContrat()" />
        <span>Contrat annuel</span>
      </label>
    </div>
   	<div class="col s3">	
      <label>
        <input name="typeContrat" id="contratTemporaire" type="radio" value="contratTemporaire" onchange = "toggleDateContrat()"/>
        <span>Contrat temporaire</span>
      </label>
      </div>
      </div>
      <div class = "row" id ="rowDateContratTemporaire" style = "display : none;">
      	<div class="col s3">
      	  <input type="date" name="dateDebut" class="datepicker">
      	  <label>Date d'effet</label>
       </div>
       <div class="col s3 offset-s1">
       <input type="date" name="dateFin" class="datepicker">
      	  <label>Date de fin</label>
       </div>
       		</div>
		<br>
		<div class="row">
			
    	<div class="col s3">	
      <label>
        <input name="flotte" id="flotteOuverte" type="radio" value = "flotteOuverte" checked onchange = "createTable()" />
        <span>Flotte ouverte</span>
      </label>
    </div>
    
    <div class="col s3">	
      <label>
        <input name="flotte" id ="vehiculeDesigne" type="radio" value="vehiculeDesigne" onchange = "createTable()" />
        <span>Véhicule(s) désigné(s)</span>
      </label>
    </div>    
    </div>
    
    <div class="row" id="tableVehicules" style="display:none;">
    	<table id = "empTable">
    		<tr>
    			<th>Marque</th><th>Genre</th><th>Type</th><th>Immat</th><th>Cotisation</th><th></th>
    		</tr>
    		<tr>
    			<td><input name="marque1" id="marque1" type="text" /></td>
    			<td><input name="genre1" type="text" /></td>
    			<td><input name="type1" type="text" /></td>
    			<td><input name="immatriculation1" type="text" /></td>
    			<td><input name="cotisation1" type="text" /></td>
    			<td></td>
    		</tr>
    	</table>
    	<br>
    	<a class="btn-floating"><i class="material-icons" id="bt" onclick = "sumbit()">add</i></a>
    </div>    
    		<br>		
		<div class="row">
			<div class="col s3">	
      <label>
        <input name="typeCotisation" type="radio" id ="cotisationCA" value="cotisationCA" checked onchange = "toggleCotisation()"  />
        <span>Cotisation au CA</span>
      </label>
    </div>
    	<div class="col s3">	
      <label>
        <input name="typeCotisation" type="radio" id = "cotisationVehicule" value = "cotisationVehicule" onchange = "toggleCotisation()"/>
        <span>Cotisation au véhicule</span>
      </label>
    	</div>
	</div>
	
	<div class = "row" >
      	<div class="col s3" id="rowCotisationCA"  style = "display : block;">
      	  <input type="number" name="cotisationCA"  >
      	  <label>Montant de la cotisation au CA</label>
      	  </input>
       </div>
       
       <div class="col s3" id="rowCotisationVehicule"  style = "display : none;" >
       <input type="number" name="cotisationVehicule" >
      	  <label>Montant de la cotisation aux véhicules</label>
       </div>
       
	</div>
				<br>
		<div class="row">
			<div class="col s3">	
      <label>
        <input name="typeMarchandise" type="radio" value = "marchandiseSensible" checked />
        <span>Marchandises sensibles</span>
      </label>
    </div>
    	<div class="col s3">	
      <label>
        <input name="typeMarchandise" type="radio" value = "marchandiseNonSensible" />
        <span>Marchandises non sensibles</span>
      </label>
    	</div>
	</div>
	</div>
	<br>
	<h5> Garanties souscrites </h5> 
	<hr>
	<br>
	<div class="row">
	<div class="col s4">
		<div class="row">
			<label>
		        	<input type="checkbox" id = "IAC" name = "IAC" class="filled-in" />
        			<span>Garantie IAC</span>
			</label>
		</div>
	</div>
	<div class="col s4">
		<div class="row">
			<label>
		        	<input type="checkbox" id = "HIAC" name = "HIAC" class="filled-in" />
        			<span>Garantie HIAC</span>
			</label>
		</div>
	</div>
	
	<div class="col s4">
		<div class="row">
			<label>
		        	<input type="checkbox" id = "garantieVol" name = "garantieVol" class="filled-in" />
        			<span>Garantie Vol</span>
			</label>
		</div>
	</div>
	
	</div>
	

    <h5>Informations diverses sur les montants</h5>
<hr>
<br> 

 <div class="row">
	<div class="col s4">
		<div class="row">
			<label>
			        <input id="capital" name = "capital" type="number" data-length="10"  >
        			<span>Capital</span>
			</label>
		</div>
		<div class="row">
			<label>
			            <input id="nombreDeSinistres" name = "nombreDeSinistres" type="number" data-length="10"  >
        			<span>Nombre de sinistres</span>
			</label>
		</div>
		
    	</div>


	<div class="col s4 offset-s1">
		<div class="row">
			<label>
		            <input id="franchiseParVehiculeRoulant" name = "franchiseParVehiculeRoulant" type="number" data-length="10"  >
        			<span>Franchise par véhicule roulant</span>
			</label>
    	</div>
		<div class="row">
			<label>
			            <input id="franchiseToutCas" name = "franchiseToutCas" type="number" data-length="10"  >
        			<span>Franchise tout cas</span>
			</label>
		</div>
	</div>
</div>

<input type="hidden" name = "nbVehicules" id = "nbVehicules" value = "1" >

<div class="row"> 
                  <div class="col s4  offset-s2">
                       <a href="file:///home/boukala/Bureau/parallax-template/index.html">Annuler</a>
                  </div>
                  
                  <div class="col s4  offset-s1">
                       <button class="btn waves-effect waves-light" type="submit" name="action">Valider<i class="material-icons right">send</i></button>
                  </div>
</div>
<br>


         </form>



<script>
function toggleExp() {
	var x = document.getElementById("expositions").checked;
	if (x) document.getElementById('divNbExpo').style.display = 'block' ;
	else document.getElementById('divNbExpo').style.display = 'none' ;
}

function toggleDateContrat() {
	//alert("coucou");
	if (document.getElementById("contratTemporaire").checked) 
	{
		 document.getElementById('rowDateContratTemporaire').style.display = 'block';
	}
	else
	{
		 document.getElementById('rowDateContratTemporaire').style.display = 'none';
	}
}

function toggleAssureAdditionnel() {
	var x = document.getElementById("assureAdditionnel").checked;
	if (x) document.getElementById('divAssureAdditionnel').style.display = 'block' ;
	else document.getElementById('divAssureAdditionnel').style.display = 'none' ;
}

// var x = document.getElementById("expositions").value

/* $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
  });
*/

//ARRAY FOR HEADER.
var arrHead = new Array();
arrHead = ['Marque', 'Genre', 'Type','Immatriculation','cotisation',''];      // SIMPLY ADD OR REMOVE VALUES IN THE ARRAY FOR TABLE HEADERS.

// FIRST CREATE A TABLE STRUCTURE BY ADDING A FEW HEADERS AND
// ADD THE TABLE TO YOUR WEB PAGE.
function createTable() {
    /* 
    var empTable = document.createElement('table');
    empTable.setAttribute('id', 'empTable');            // SET THE TABLE ID.

    var tr = empTable.insertRow(-1);

    for (var h = 0; h < arrHead.length; h++) {
        var th = document.createElement('th');          // TABLE HEADER.
        th.innerHTML = arrHead[h];
        tr.appendChild(th);
    }

    var div = document.getElementById('cont');
    div.appendChild(empTable);    // ADD THE TABLE TO YOUR WEB PAGE.
    */
    if (document.getElementById("vehiculeDesigne").checked) 
	{
		 document.getElementById('tableVehicules').style.display = 'block';
	}
	else
	{
		 document.getElementById('tableVehicules').style.display = 'none';
	}
    
}


// DELETE TABLE ROW.
function removeRow(oButton) {
    var empTab = document.getElementById('empTable');
    empTab.deleteRow(oButton.parentNode.parentNode.rowIndex);       // BUTTON -> TD -> TR.
}

// EXTRACT AND SUBMIT TABLE DATA.
function sumbit() {
	/*alert('salut');
    var myTab = document.getElementById('empTable');
    var values = new Array();

    // LOOP THROUGH EACH ROW OF THE TABLE.
    for (row = 1; row < myTab.rows.length - 1; row++) {
        for (c = 0; c < myTab.rows[row].cells.length; c++) {   // EACH CELL IN A ROW.

            var element = myTab.rows.item(row).cells[c];
            if (element.childNodes[0].getAttribute('type') == 'text') {
                values.push("'" + element.childNodes[0].value + "'");
            }
        }
    }
    console.log(values); */
    var empTab = document.getElementById('empTable');
    var nbVehicules = parseInt(document.getElementById('nbVehicules').value) + 1;
    document.getElementById('nbVehicules').value = nbVehicules;
    alert(nbVehicules) ;
    var rowCnt = empTab.rows.length;        // GET TABLE ROW COUNT.
    var tr = empTab.insertRow(rowCnt);      // TABLE ROW.
    //tr = empTab.insertRow(rowCnt);
	var tabName  = [ "marque", "genre", "type" , "immatriculation" , "cotisation" ];
    for (var c = 0; c < arrHead.length-1; c++) {
        var td = document.createElement('td');          // TABLE DEFINITION.
        td = tr.insertCell(c);

            // CREATE AND ADD TEXTBOX IN EACH CELL.
            var ele = document.createElement('input');
            ele.setAttribute('type', 'text');
            ele.setAttribute('value', nbVehicules);
           // ele.setAttribute('name',tabName[c]+nbVehicules); */
            ele.name=tabName[c]+nbVehicules ; 
            /*var elt = '<input type="text" id="'+tabName[c]+nbVehicules+'" name="'+tabName[c]+nbVehicules+'">' ;
            alert(elt) ;
            td.innerHTML = elt; */
            td.appendChild(ele);

    }
    var button = document.createElement('input');
    var td = document.createElement('td');          // TABLE DEFINITION.
    td = tr.insertCell(c);
    // SET INPUT ATTRIBUTE.
    button.setAttribute('type', 'button');
    button.setAttribute('value', 'Supprimer');
    
	//<a class="btn-floating"><i class="material-icons" id="bt" onclick = "sumbit()">add</i></a>


    // ADD THE BUTTON's 'onclick' EVENT.
    button.setAttribute('onclick', 'removeRow(this)');

    td.appendChild(button);
    
}

function toggleCotisation() {
	//alert("coucou");
	if (document.getElementById("cotisationCA").checked) 
	{
		 document.getElementById('rowCotisationCA').style.display = 'block';
		 document.getElementById('rowCotisationVehicule').style.display = 'none';

	}

	if (document.getElementById("cotisationVehicule").checked) 
	{
		 document.getElementById('rowCotisationCA').style.display = 'none';
		 document.getElementById('rowCotisationVehicule').style.display = 'block';
 
	}
}


function voir() {
	var marque1 = document.getElementById('marque1').value ;
	var marque2 = document.getElementById('marque2').value ;
	alert(marque1+' '+marque2) ;
}
  
</script>
</body>
</html>
               
