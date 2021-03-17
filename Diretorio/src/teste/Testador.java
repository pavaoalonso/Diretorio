package src.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Testador {

	public static void main(String[] args) {

		String url = "C://STI";

		Path caminho = Paths.get(url);

		System.out.println(Files.exists(caminho));
		System.out.println(Files.isDirectory(caminho));

		try {

			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(caminho);

			for (Path cam : directoryStream) {
				System.out.println(cam);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
