package Controle;

import java.sql.Connection;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

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
							+ "`TimeDirF`, `golsTimeEsqF`, `golsTimeDirF`) VALUES (NULL, '?', '?', '?', '?', '?',"
							+ " '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?'"
							+ ", '?', '?', '?', '?', '?', '?', '?', '?');");

			inserirBolao.setString(1, bolao.getJogador());
			
			//Quartas de final
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
			
			//Semifinal
			inserirBolao.setString(18, bolao.getPlacarSfIndex(0).getTimeEsq());
			inserirBolao.setString(19, bolao.getPlacarSfIndex(0).getTimeDir());
			inserirBolao.setInt(20, bolao.getPlacarSfIndex(0).getGolsTimeEsq());
			inserirBolao.setInt(21, bolao.getPlacarSfIndex(0).getGolsTimeDir());
			inserirBolao.setString(22, bolao.getPlacarSfIndex(1).getTimeEsq());
			inserirBolao.setString(23, bolao.getPlacarSfIndex(1).getTimeDir());
			inserirBolao.setInt(24, bolao.getPlacarSfIndex(1).getGolsTimeEsq());
			inserirBolao.setInt(25, bolao.getPlacarSfIndex(1).getGolsTimeDir());
			
			//Final
			inserirBolao.setString(26, bolao.getPlacarF().getTimeEsq());
			inserirBolao.setString(27, bolao.getPlacarF().getTimeDir());
			inserirBolao.setInt(28, bolao.getPlacarF().getGolsTimeEsq());
			inserirBolao.setInt(29, bolao.getPlacarF().getGolsTimeDir());

			inserirBolao.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
