package CustomShop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


public class FileOrder {
	private final PartData data;
	private final PartHardwares dataHW;
	private final String email;
	
	public FileOrder(PartData data,PartHardwares dataHW,String email) {
		this.data = data;
		this.dataHW = dataHW;		 
		this.email = email;
	}
	public String getFormattedDate() {
		final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

		return dateFormat.format(System.currentTimeMillis());
	}
	public void writeBill() throws IOException{
		int relicCost = data.isRelic()?2000:0;
		int HardcaseCost = dataHW.isHardCase()?7000:0;
		int total = 150000 + relicCost + HardcaseCost;
		
		DecimalFormat decFor = new DecimalFormat("#,###.##");
		
		File toRead = new File(Paths.get("").toAbsolutePath() + "\\Bill.txt");
		if(!toRead.exists())
			toRead.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(toRead,true));
		
		writer.write("------------------------"+ getFormattedDate()+"------------------------"
					+"\nemail : " + email
					+"\nColor & Wood Body : "+dataHW.getHandside()+(data.isRelic()?" Relic ":" No Relic ")+ data.getColor()
					+" "+data.getBodyWood()
					
					+"\nNeck & Fret : " + data.getNeckRadius()+" "+data.getNeckShape()
					+" "+ data.getNeckWood()+" "+data.getFretType()
					
					+"\n- Hardwares - "
					+"\nPickups : "+dataHW.getPickUps()
					+"\nSaddle  : "+dataHW.getSaddle()
					+"\nTuner   : "+dataHW.getTuner()				 
				    +"\nPickguard Type  : "+dataHW.getPickguard()
				    +"\nPlastic Coler   : "+dataHW.getPlasticColor()
				    +"\nHardwares Color :"+dataHW.getHardwareColor()
				    +"\nHardcase : "+(dataHW.isHardCase()?"With Hardcase":"NO Hardcase")
					+"\nTotal : "+ decFor.format(total) +" Baht.");
		writer.write("\n-------------------------------------------------------------------\n");
		writer.close();
			
		
		
	}
}
