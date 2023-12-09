
//Que. 6 Write a program to count number of bytes in a image file(jpeg/png/gif). Also find how
//much time it will take to upload the file on server if internet speed is 256 bps(bitsper
//second).
/*To calculate how much time it will take to upload a file to a server given an internet speed of 256 bits per second (bps), you can use the following formula:

Time (in seconds) = File Size (in bits) / Upload Speed (in bps)

First, you need to convert your file size to bits if it's not already in that unit. Here's how you can calculate the upload time for a file:

Convert the file size to bits if it's not already in bits. If your file size is in bytes, multiply it by 8 to convert to bits because there are 8 bits in 1 byte.

Use the formula mentioned above to calculate the time it will take to upload the file.

Here's an example:

Let's say your file size is 1 megabyte (1 MB), and you want to upload it with an internet speed of 256 bps.

Convert the file size to bits: 1 MB = 1,000,000 bytes * 8 bits/byte = 8,000,000 bits.

Use the formula to calculate the time:

Time (seconds) = 8,000,000 bits / 256 bps = 31,250 seconds.

Now, you have the time in seconds. If you want to convert it to minutes, hours, or any other time unit, you can further divide by 60 for minutes or by 3600 for hours, depending on your desired time unit. In this example, the upload time would be approximately 520.83 minutes or 8.68 hours.

 */
import java.io.File; 
import java.io.FileWriter;      

public class Pr6 {
    public static void main(String[] args) throws Exception {

        File f = new File("davv.png");
        double internetSpeed = 256;
        long fileSize = f.length();
        double uploadTime = (fileSize * 8) / internetSpeed;
        System.out.println(" File Size  " + fileSize + " bytes ");
        System.out.println(" Upload time " + uploadTime + " sec ");
    }

}
