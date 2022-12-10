package Controle;

import java.sql.Connection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Bolao;
import Modelo.Placar;

public class BolaoDAO {

	public void inserir(Bolao bolao) {
		try {
			Connection connection = new ConecBanco().getConnection();

			PreparedStatement inserirBolao = connection
					.prepareStatement("INSERT INTO `bolão-tecprog` (`ID`, `Jogador`, `TimeEsqQf1`, `TimeDirQF1`, "
							+ "`golsTimeEsqQf1`, `golsTimeDirQf1`, `TimeEsqQf2`, `TimeDirQf2`, `golsTimeEsqQf2`,"
							+ " `golsTimeDirQf2`, `TimeEsqQf3`, `TimeDirQf3`, `golsTimeEsqQf3`, `golsTimeDirQf3`, `TimeEsqQf4`,"
							+ " `TimeDirQf4`, `golsTimeEsqQf4`, `golsTimeDirQf4`, `TimeEsqSf1`, `TimeDirSf1`, `golsTimeEsqSf1`, "
							+ "`golsTimeDirSf1`, `TimeEsqSf2`, `TimeDirSf2`, `golsTimeEsqSf2`, `golsTimeDirSf2`, `TimeEsqF`, "
							+ "`TimeDirF`, `golsTimeEsqF`, `golsTimeDirF`) VALUES (NULL, ?, ?, ?, ?, ?,"
							+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?" + ", ?, ?, ?, ?, ?, ?, ?, ?);");

			inserirBolao.setString(1, bolao.getJogador());

			// Quartas de final
			inserirBolao.setString(2, bolao.getPlacarQfIndex(0).getTimeEsq());
			inserirBolao.setString(3, bolao.getPlacarQfIndex(0).getTimeDir());
			inserirBolao.setInt(4, bolao.getPlacarQfIndex(0).getGolsTimeEsq());
			inserirBolao.setInt(5, bolao.getPlacarQfIndex(0).getGolsTimeDir());
			inserirBolao.setString(6, bolao.getPlacarQfIndex(1).getTimeEsq());
			inserirBolao.setString(7, bolao.getPlacarQfIndex(1).getTimeDir());
			inserirBolao.setInt(8, bolao.getPlacarQfIndex(1).getGolsTimeEsq());
			inserirBolao.setInt(9, bolao.getPlacarQfIndex(1).getGolsTimeDir());
			inserirBolao.setString(10, bolao.getPlacarQfIndex(2).getTimeEsq());
			inserirBolao.setString(11, bolao.getPlacarQfIndex(2).getTimeDir());
			inserirBolao.setInt(12, bolao.getPlacarQfIndex(2).getGolsTimeEsq());
			inserirBolao.setInt(13, bolao.getPlacarQfIndex(2).getGolsTimeDir());
			inserirBolao.setString(14, bolao.getPlacarQfIndex(3).getTimeEsq());
			inserirBolao.setString(15, bolao.getPlacarQfIndex(3).getTimeDir());
			inserirBolao.setInt(16, bolao.getPlacarQfIndex(3).getGolsTimeEsq());
			inserirBolao.setInt(17, bolao.getPlacarQfIndex(3).getGolsTimeDir());

			// Semifinal
			inserirBolao.setString(18, bolao.getPlacarSfIndex(0).getTimeEsq());
			inserirBolao.setString(19, bolao.getPlacarSfIndex(0).getTimeDir());
			inserirBolao.setInt(20, bolao.getPlacarSfIndex(0).getGolsTimeEsq());
			inserirBolao.setInt(21, bolao.getPlacarSfIndex(0).getGolsTimeDir());
			inserirBolao.setString(22, bolao.getPlacarSfIndex(1).getTimeEsq());
			inserirBolao.setString(23, bolao.getPlacarSfIndex(1).getTimeDir());
			inserirBolao.setInt(24, bolao.getPlacarSfIndex(1).getGolsTimeEsq());
			inserirBolao.setInt(25, bolao.getPlacarSfIndex(1).getGolsTimeDir());

			// Final
			inserirBolao.setString(26, bolao.getPlacarF().getTimeEsq());
			inserirBolao.setString(27, bolao.getPlacarF().getTimeDir());
			inserirBolao.setInt(28, bolao.getPlacarF().getGolsTimeEsq());
			inserirBolao.setInt(29, bolao.getPlacarF().getGolsTimeDir());

			inserirBolao.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ArrayList<Bolao> Informacoes() {

		Connection connection = new ConecBanco().getConnection();
		ArrayList<Bolao> bolaoList = new ArrayList<Bolao>();

		try {
			ResultSet result = connection.prepareStatement("SELECT * FROM `bolão-tecprog`").executeQuery();
			
			Bolao bolao;
			Placar placar;

			while (result.next()) {
				bolao = new Bolao(result.getInt("ID"),result.getString("Jogador"));
				bolao.setPlacarQfIndex(0, new Placar(result.getString("TimeEsqQf1"),result.getString("TimeDirQF1"),result.getInt("golsTimeEsqQf1"),result.getInt("golsTimeDirQf1")));
				bolao.setPlacarQfIndex(1, new Placar(result.getString("TimeEsqQf2"),result.getString("TimeDirQf2"),result.getInt("golsTimeEsqQf2"),result.getInt("golsTimeDirQf2")));
				bolao.setPlacarQfIndex(2, new Placar(result.getString("TimeEsqQf3"),result.getString("TimeDirQf3"),result.getInt("golsTimeEsqQf3"),result.getInt("golsTimeDirQf3")));
				bolao.setPlacarQfIndex(3, new Placar(result.getString("TimeEsqQf4"),result.getString("TimeDirQf4"),result.getInt("golsTimeEsqQf4"),result.getInt("golsTimeDirQf4")));
				
				bolao.setPlacarSfIndex(0, new Placar(result.getString("TimeEsqSf1"),result.getString("TimeDirSf1"),result.getInt("golsTimeEsqSf1"),result.getInt("golsTimeDirSf1")));
				bolao.setPlacarSfIndex(1, new Placar(result.getString("TimeEsqSf2"),result.getString("TimeDirSf2"),result.getInt("golsTimeEsqSf2"),result.getInt("golsTimeDirSf2")));
				
				bolao.setPlacarF(new Placar(result.getString("TimeEsqF"),result.getString("TimeDirF"),result.getInt("golsTimeEsqF"),result.getInt("golsTimeDirF")));
				bolaoList.add(bolao);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return bolaoList;
	}
    public boolean importFromFile(File arquivo) {
        ArrayList<Bolao> bolaoList = new ArrayList<Bolao>();
        try {
            Scanner myScanner = new Scanner(arquivo);
            Bolao bolao;
            while(myScanner.hasNextLine()) {
                String[] strSplit =  myScanner.nextLine().split(";");

                bolao = new Bolao(strSplit[0]);
                bolao.setPlacarQfIndex(0, new Placar(strSplit[1],strSplit[3],Integer.parseInt(strSplit[2]), Integer.parseInt(strSplit[4])));
                bolao.setPlacarQfIndex(1, new Placar(strSplit[5],strSplit[7],Integer.parseInt(strSplit[6]), Integer.parseInt(strSplit[8])));
                bolao.setPlacarQfIndex(2, new Placar(strSplit[9],strSplit[11],Integer.parseInt(strSplit[10]), Integer.parseInt(strSplit[12])));
                bolao.setPlacarQfIndex(3, new Placar(strSplit[13],strSplit[15],Integer.parseInt(strSplit[14]), Integer.parseInt(strSplit[16])));
                
                bolao.setPlacarSfIndex(0, new Placar(strSplit[17],strSplit[19],Integer.parseInt(strSplit[18]), Integer.parseInt(strSplit[20])));
                bolao.setPlacarSfIndex(1, new Placar(strSplit[21],strSplit[23],Integer.parseInt(strSplit[22]), Integer.parseInt(strSplit[24])));
                

                bolao.setPlacarF(new Placar(strSplit[25],strSplit[27],Integer.parseInt(strSplit[26]), Integer.parseInt(strSplit[28])));

                this.inserir(bolao);

            }
            return true;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        public boolean ExportarArquivos(File arquivo) {

            try {
                FileWriter fileWriter = new FileWriter(arquivo);
                String strFormatted;
                for(Bolao bolao : this.Informacoes()) {
                    strFormatted =  String.format("%s;%s;%s;%s;%s;%s;%s\n",
                            bolao.getJogador().toUpperCase(),
                            bolao.ArquivoStringQF(0),
                            bolao.ArquivoStringQF(1),
                            bolao.ArquivoStringQF(2),
                            bolao.ArquivoStringQF(3),
                            bolao.ArquivoStringSF(0),
                            bolao.ArquivoStringSF(1),
                            bolao.ArquivoStringF());
                    fileWriter.write(strFormatted);
                }
                fileWriter.close();
                return true;
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
                return false;
            }
        }
    

}
