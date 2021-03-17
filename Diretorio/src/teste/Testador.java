package teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Testador {

	public static void main(String[] args) throws IOException {

		/*
		 * Caminho Grupos das Turmas
		 */
		String url = "\\\\10.18.3.215\\stream_1\\prod\\mp4";
		
		
		/*
		 * Caminho Grupos das Turmas
		 */
//		String url = "\\\\10.18.10.18\\grupos\\DIRATIC\\Alonso";
		
		
		
		

		Path caminho = Paths.get(url);

		System.out.println(Files.exists(caminho));
		System.out.println(Files.isDirectory(caminho));

		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(caminho);

		for (Path cam : directoryStream) {
			System.out.println(cam);
		}
	}
}
