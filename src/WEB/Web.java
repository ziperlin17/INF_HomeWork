package WEB;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;

public class Web {

    public static void main(String[] args) {
        try {
            String token = "DVXT9QJ-BXV47MW-GX5QZA9-AGDXV3X";
            String url = URLEncoder.encode("https://google.com");
            int width = 1920;
            int height = 1080;
            String output = "image";
            String query = "https://shot.screenshotapi.net/screenshot";
            query += String.format("?token=%s&url=%s&width=%d&height=%d&output=%s",
                    token, url, width, height, output);
            URL apiUrl = new URL(query);

            // Call the API and save the screenshot
            InputStream inputStream = apiUrl.openStream();
            OutputStream outputStream = new FileOutputStream("./OpenMe.png");
            inputStream.transferTo(outputStream);

            inputStream.close();
            outputStream.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}