// import javax.swing.*;
// import java.awt.*;

// class Panel extends JPanel {
//     public void paintComponent(Graphics g) {
//         ImageIcon image = new ImageIcon("davv.png");
//         g.drawImage(image.getImage(), 300, 300, 44, 24, null);
//     }

// }

// public class Image {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Image");
//         frame.setSize(600, 600);
//         frame.setLocation(0, 0);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setContentPane(new Panel());
//         frame.setVisible(true);
//     }
// }
// import javax.swing.*;
// import java.awt.*;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import javax.imageio.ImageIO;

// public class MarksheetExample {
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> createAndShowGUI());
//     }

//     private static void createAndShowGUI() {
//         JFrame frame = new JFrame("BCA Marksheet");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(new BorderLayout());

//         // Load the college logo
//         BufferedImage logo = null;
//         try {
//             logo = ImageIO.read(new File("davv.png")); // Replace with the actual path to your logo image file
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         // Create a panel for the marksheet
//         JPanel marksheetPanel = new JPanel(new GridLayout(5, 2));

//         // Marksheet contents
//         marksheetPanel.add(new JLabel("Student Name:"));
//         marksheetPanel.add(new JLabel("John Doe"));

//         marksheetPanel.add(new JLabel("Roll Number:"));
//         marksheetPanel.add(new JLabel("123456"));

//         marksheetPanel.add(new JLabel("Subject1:"));
//         marksheetPanel.add(new JLabel("90"));

//         marksheetPanel.add(new JLabel("Subject2:"));
//         marksheetPanel.add(new JLabel("85"));

//         marksheetPanel.add(new JLabel("Subject3:"));
//         marksheetPanel.add(new JLabel("95"));

//         // Create a label for the logo
//         JLabel logoLabel = new JLabel(new ImageIcon(logo));

//         // Add components to the frame
//         frame.add(logoLabel, BorderLayout.NORTH);
//         frame.add(marksheetPanel, BorderLayout.CENTER);

//         // Set the size of the frame
//         frame.setSize(400, 300);

//         // Display the frame
//         frame.setVisible(true);
//     }
// }
// import javax.swing.*;
// import java.awt.*;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import javax.imageio.ImageIO;

// public class MarksheetExample {
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> createAndShowGUI());
//     }

//     private static void createAndShowGUI() {
//         JFrame frame = new JFrame("BCA Marksheet");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(new BorderLayout());

//         // Load the college logo
//         BufferedImage logo = null;
//         try {
//             logo = ImageIO.read(new File("davv.png")); // Replace with the actual path to your logo image file
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         // Create a panel for the marksheet
//         JPanel marksheetPanel = new JPanel(new GridLayout(5, 2));

//         // Marksheet contents
//         marksheetPanel.add(new JLabel("Student Name:"));
//         marksheetPanel.add(new JLabel("John Doe"));

//         marksheetPanel.add(new JLabel("Roll Number:"));
//         marksheetPanel.add(new JLabel("123456"));

//         marksheetPanel.add(new JLabel("Subject1:"));
//         marksheetPanel.add(new JLabel("90"));

//         marksheetPanel.add(new JLabel("Subject2:"));
//         marksheetPanel.add(new JLabel("85"));

//         marksheetPanel.add(new JLabel("Subject3:"));
//         marksheetPanel.add(new JLabel("95"));

//         // Create a label for the logo
//         JLabel logoLabel = new JLabel(new ImageIcon(logo));

//         // Add components to the frame
//         frame.add(logoLabel, BorderLayout.NORTH);
//         frame.add(marksheetPanel, BorderLayout.CENTER);

//         // Set the size of the frame
//         frame.setSize(400, 300);

//         // Display the frame
//         frame.setVisible(true);
//     }
// }
