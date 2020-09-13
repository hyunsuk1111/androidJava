package instagram;

import java.io.DataOutput;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class FileSave {
	public void FileSave(ArrayList<UserVO> list) {
		try {
			FileWriter w = new FileWriter("Userdata.txt");
			for (int j = 0; j < list.size(); j++) {
				UserVO data = list.get(j);
				w.append(data.uID + "\n");
				w.append(data.uPhone + "\n");
				w.append(data.uPhone + "\n");
				w.append(data.uCDate + "\n");
			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
