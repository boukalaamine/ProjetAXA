package controler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.CharacterRun;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import model.Garantie;

public class Test {
	
	
	public static void replaceAll(Garantie garantie)
	{
		String fileModel = "/home/boukala/Bureau/Test.doc";
		String fileResult = "/home/boukala/Bureau/TestSortie" + ".doc";
        POIFSFileSystem fs = null;
        try {            
            fs = new POIFSFileSystem(new FileInputStream(fileModel));            
            HWPFDocument doc = new HWPFDocument(fs);
            doc = replaceText(doc,"$TEST", "Ceci n'est qu'un Test");
            saveWord(fileResult, doc);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
	}
	
    public static void main(String[] args){
        replaceAll(null);
    }

    private static HWPFDocument replaceText(HWPFDocument doc, String findText, String replaceText){
        Range r1 = doc.getRange(); 

        for (int i = 0; i < r1.numSections(); ++i ) { 
            Section s = r1.getSection(i); 
            for (int x = 0; x < s.numParagraphs(); x++) { 
                Paragraph p = s.getParagraph(x); 
                for (int z = 0; z < p.numCharacterRuns(); z++) { 
                    CharacterRun run = p.getCharacterRun(z); 
                    String text = run.text();
                    if(text.contains(findText)) {
                        run.replaceText(findText, replaceText);
                    } 
                }
            }
        } 
        return doc;
    }

    private static void saveWord(String filePath, HWPFDocument doc) throws FileNotFoundException, IOException{
        FileOutputStream out = null;
        try{
            out = new FileOutputStream(filePath);
            doc.write(out);
        }
        finally{
            out.close();
        }
    } 
    
    public static void clauseMarchandiseSensibleVol(Garantie garantie , HWPFDocument doc)
    {
    	
    	String sensible = "";
    	
    	if(garantie.getTypeMarchandise().equals("marchandiseNonSensible")) {
    		sensible = "non";
    	}

    		 String data = "Marchandises sensibles aux vols"+ "\r\n" + "\r\n" +"Vous déclarez transporter des matériels et marchandises liés à votre profession considérés comme "+ sensible +" sensibles au vol au même titre que les marchandises énumérées ci-après :\n" + 
            		 "\r\n" + 
            		 "\r\n" + "-Consoles et Jeux vidéo" + 
            		 "\r\n" +"-Électroménager." + 
            		 "\r\n" + "-Hi-Fi, lecteurs [son, vidéo], CD, DVD." + 
            		 "\r\n" + "-Matériels, Équipements de sports et loisirs." + 
            		 "\r\n" + "-Matériel informatique y compris composants." + 
            		 "\r\n" + "-Matériel de prise de vue [argentique, numérique]." + 
            		 "\r\n" + "-Métaux non ferreux." + 
            		 "\r\n" + "-Tabac, alcool [hors bière et vin sans AOC]," + 
            		 "\r\n" + "-Téléphonie." + 
            		 "\r\n" + "-Textile, Habillement.";
            
            doc = replaceText(doc,"$marchandisesSensibles", data);
    	/*}
    	else
    	{
            doc = replaceText(doc,"$marchandisesSensibles", "");
    	}*/
    	
    }
    
    public static void typeContrat(Garantie garantie, HWPFDocument doc)
    {
    	String data = "";
    	if(garantie.getTypeContrat().equals("contratAnnuel"))
    	{
        	data = "Duréee et validité du contrat" + "\r\n" + "\r\n" + "Le contrat est souscrit jusqu’à la date de la première échéance principale et est dès lors reconduit tacitement d’année en année, sauf résiliation par l’une ou l’autre des parties dans les cas, formes et délais prévus aux Conditions générales.";
    	}
    	if(garantie.getTypeContrat().equals("contratAnnuel"))
    	{
    		data = "Le contrat est souscrit pour une durée temporaire et cessera tous ses effets à compter du : [&].";
    	}
    	
        doc = replaceText(doc,"$typeContrat", data);


    }
    
    public static void citerne (Garantie garantie, HWPFDocument doc)
    {
    	String data ="";
    	if(garantie.getCiterne().equals("on")) {
    			data = "Transport en citerne"+ "\r\n" + "\r\n" + "Cette garantie est acquise aux conditions exprimées à l’article 3.4.3 « Autres garanties » des Conditions Générales.";
    	}	
    	doc = replaceText(doc,"$citerne", data);

       
    }
    
    public static void flotte (Garantie garantie, HWPFDocument doc)
    {
    		String data = "";
    		
    		if(garantie.getFlotte().equals("flotteOuverte")) {
		
    			data = "Flotte ouverte"+ "\r\n" + "\r\n" + "Vous nous avez déclaré lors de la souscription l'état de votre parc automobile et ses caractéristiques conformes à celles figurant sur les cartes grises de chaque véhicule.\r\n" + 
		 		"\r\n" + 
		 		"En fonction de cet état un capital garanti a été fixé d'un commun accord au vu des marchandises que vous transportez.\r\n" + 
		 		"\r\n" + 
		 		"Nous vous dispensons de déclarer en cours d'exercice toute mise en service de nouveau véhicule ou retrait étant entendu :\r\n" + 
		 		"\r\n" + 
		 		"Que notre garantie vous est acquise au cours de l'exercice concerné,\r\n" + 
		 		"\r\n" + 
		 		"Que vous vous engagez à déclarer l'état détaillé de votre parc arrêté à la date d'échéance anniversaire de votre contrat.\r\n" + 
		 		"\r\n" + 
		 		"À la suite de cette déclaration, nous établirons un avenant sur l'exercice antérieur dont le montant de la régularisation [cotisation ou ristourne] sera calculé à raison de 50 % de la différence entre l'ancienne et la nouvelle cotisation annuelle.\r\n" + 
		 		"\r\n" + 
		 		"À défaut de cette déclaration, nous pourrons vous mettre en demeure, par lettre recommandée, de satisfaire à cette obligation dans les 10 jours à partir de l'envoi de cette lettre, le cachet de la Poste faisant foi.\r\n" + 
		 		"Si passé ce délai, vous ne nous avez pas adressé l'état de votre parc, nous émettrons un avenant ressortant une cotisation provisoire calculée sur la base de votre dernière déclaration majorée de 50 %.\r\n" + 
		 		"\r\n" + 
		 		"Nous pouvons également, à toute époque, vous demander la production de toutes pièces justificatives afin de procéder à une vérification de vos déclarations.\r\n" + 
		 		"\r\n";
       
       doc = replaceText(doc,"$flotte", data);
    	}
    }
    
    
    public static void frigo (Garantie garantie, HWPFDocument doc)
    {
    	if(garantie.getFrigo().equals("on")) {
		
		 String data = "Flotte ouverte"+ "\r\n" + "\r\n" + "Cette garantie est acquise aux conditions exprimées à l’article 3.4.1 « Autres Garanties » des Conditions Générales.";
       
       doc = replaceText(doc,"$frigo", data);
    	}
    	
    	else
    	{
    		doc = replaceText(doc,"$frigo", "");
    	}
    }
    
    
    public static void animauxVivants (Garantie garantie, HWPFDocument doc)
    {
    
    	String data ="";
    	
    	if(garantie.getAnimauxVivants().equals("on")) {
		
    		data = "Transport d'animaux vivants"+ "\r\n" + "\r\n" + "Cette garantie est acquise aux conditions exprimées à l’article 3.4.1 « Autres Garanties » des Conditions Générales.";
    	}
    	
       doc = replaceText(doc,"$animauxVivants", data);
	/*}
	else
	{
       doc = replaceText(doc,"$marchandisesSensibles", "");
	}*/
    }
    
    public static void recommandationsContreRisqueVol (Garantie garantie, HWPFDocument doc)
    {
		
		 String data = "Recommandations contre les risques de vol"+ "\r\r\n" + "\r\r\n" + "Nous vous recommandons : \r\n" + 
		 		"\r\n" + 
		 		"- de fermer et verrouiller les issues de votre véhicule et d’enclencher ses dispositifs antivol avant de le quitter,\r\n" + 
		 		"\r\n" + 
		 		"- de charger vos biens dans une partie non visible de l’extérieur de votre véhicule, \r\n" + 
		 		"\r\n" + 
		 		"- de décharger en lieu sûr vos biens, en cas de stationnement,\r\n" + 
		 		"\r\n" + 
		 		"- de prévoir à l’avance vos stationnements sur des aires sécurisées. \r\n" + 
		 		"\r\n" + 
		 		"";
       
       doc = replaceText(doc,"$recommandationsContreRisqueVol", data);
    }
    
    public static void exposition (Garantie garantie, HWPFDocument doc)
    {
    	String data="";
    
    	if(garantie.getExpositions().equals("on")) {
		
    			data = "Garantie exposition"+ "\r\n" + "\r\n" + "Pour les marchandises transportées au moyen des véhicules agréés au contrat, la garantie est acquise conformément aux articles 1, 2.3, 2.7, 2.8, 5 et 6 des Conditions Générales Multirisque Exposition dans la limite de "+garantie.getNombreExpositions() +" expositions par année d’assurance.\r\n" + 
		 		"\r\n" + 
		 		"La garantie est étendue aux opérations de déplacement des marchandises entre le véhicule et le stand d’exposition, effectuées avec des moyens techniques appropriés.  \r\n" + 
		 		"\r\n" + 
		 		"L’Assuré déclare que pendant les heures d’ouverture, la surveillance est permanente et qu’en dehors des heures d’ouverture, les locaux sont gardiennés.\r\n" + 
		 		"\r\n" + 
		 		"La durée de la garantie par foire, salon et/ou exposition ne pourra excéder quinze jours.\r\n" + 
		 		"\r\n" + 
		 		"";
    	}
       doc = replaceText(doc,"$garantieExposition", data);

    }
    
    public static void typeCotisation(Garantie garantie, HWPFDocument doc)
    {
    	String data = "";
    	if(garantie.getTypeCotisation().equals("cotisationCA")){
		
    			data = "Garantie exposition"+ "\r\n" + "\r\n" + "La cotisation suit les dispositions prévues aux Conditions Générales.\r\n" + 
		 		"\r\n" + 
		 		"La cotisation provisionnelle annuelle fixée à la souscription du contrat est de "+garantie.getCotisationParChiffreAffaire() +" € euros.\r\n" + 
		 		"\r\n" + 
		 		"La cotisation provisionnelle fixée à chaque échéance principale sera égale à 100 % de la dernière cotisation annuelle définitive connue avant l’échéance concernée.\r\n" + 
		 		"\r\n" + 
		 		"La cotisation annuelle définitive sera calculée à la fin de l’année d’assurance à raison de  % du montant de votre chiffre d’affaires réalisé pour l’activité assurée.\r\n" + 
		 		"\r\n" + 
		 		"Dans le cas où la cotisation annuelle provisionnelle excède la cotisation annuelle définitive, il sera procédé à un remboursement du trop perçu dans la limite de 40 % de la cotisation provisionnelle sans toutefois que la cotisation annuelle définitive puisse être inférieure à la cotisation annuelle minimale irréductible fixée à   €, frais et taxes en sus.\r\n" + 
		 		"\r\n" + 
		 		"Vous vous engagez à nous donner à la souscription de votre contrat d’une part, et le [&] de chaque année d’autre part, un état détaillé de votre parc.\r\n" + 
		 		"";
    	}
    	
    	if(garantie.getTypeCotisation().equals("cotisationVehicule")){
    		data = "";
    	}
		doc = replaceText(doc,"$typeCotisation", data);

	/*}
	else
	{
       doc = replaceText(doc,"$marchandisesSensibles", "");
	}*/
    }
    

    public static void activite (Garantie garantie, HWPFDocument doc)
    {		       
       doc = replaceText(doc,"$activite", garantie.getActivite());
    }
    
    public static void capital (Garantie garantie, HWPFDocument doc)
    {
		       
       doc = replaceText(doc,"$capital", garantie.getCapital()+"");
    }
    
    public static void clauseImperative(Garantie garantie, HWPFDocument doc)
    {
    
    String data = "« Je reconnais avoir été informé(e), conformément à l’article 32 de la loi du 6 janvier 1978 modifiée :\r\n" + 
    		"\r\n" + 
    		"Du caractère obligatoire des réponses aux questions posées pour l’établissement des Conditions Particulières ainsi que des conséquences qui pourraient résulter d’une omission ou d’une fausse déclaration prévues aux Articles L 113-8 (nullité du contrat) et L 113-9 (réduction des indemnités) du Code des Assurances.\r\n" + 
    		"\r\n" + 
    		"Que les destinataires des données personnelles me concernant pourront être d’une part, et en vertu d’une autorisation de la Commission Nationale de l’Informatique et Libertés, les collaborateurs de l’Assureur, responsable du traitement, tant en France qu’au Maroc, dont la finalité est la souscription, la gestion et l’exécution des contrats d’assurance et d’autre part, ses intermédiaires, réassureurs, organismes professionnels habilités ainsi que les sous-traitants missionnés.\r\n" + 
    		"\r\n" + 
    		"Que mes données peuvent être utilisées dans la mesure où elles sont nécessaires à la gestion et à l’exécution des autres contrats souscrits auprès de lui ou auprès des autres sociétés du groupe auquel il appartient.\r\n" + 
    		"\r\n" + 
    		"Que je dispose d’un droit d’accès et de rectification auprès d’AXA Service Information Clients 313 Terrasses de l’Arche 92727 Nanterre Cedex pour toute information me concernant.\r\n" + 
    		"\r\n" + 
    		"Que les données recueillies par l’Assureur lors de la souscription et des actes de gestion peuvent être utilisées par le Groupe AXA à des fins de prospection commerciale. Je peux m’y opposer en écrivant à l’adresse indiquée ci-dessus. »\r\n" + 
    		"\r\n" + 
    		"Autres dispositions \r\n" + 
    		"\r\n" + 
    		"Les garanties données par AXA sont portées en coassurance par AXA France IARD et par AXA Assurances IARD Mutuelle.\r\n" + 
    		"\r\n" + 
    		"\r\n" + 
    		"Fait à  \r\n" + 
    		"Le Souscripteur \r\n" + 
    		"L’Assureur\r\n" + 
    		" \r\n" + 
    		"\r\n" + 
    		"\r\n" + 
    		"\r\n" + 
    		"\r\n" + 
    		"SONT NULS TOUS RENVOIS, ADJONCTIONS OU MODIFICATIONS MATERIELLES NON APPROUVES PAR LE SIEGE DE L’ASSUREUR\r\n" + 
    		"";
    
    doc = replaceText(doc,"$clauseImperative", data);
    }   
}