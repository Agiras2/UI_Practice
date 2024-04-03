/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racewinner;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Andrés
 */
public class RaceWinner extends JFrame {
    JButton calculate;
    Container panel;
    JLabel title, place1, place2, place3, pedro, juan, patricio, points1, points2, points3, pointsPedro, pointsJuan, pointsPatricio;
    JTextField place1Text, place2Text, place3Text, pointsPedroText, pointsJuanText, pointsPatricioText;

    public RaceWinner() {
        super("Race Winner");
        panel = getContentPane();
        JPanel pb = new JPanel();
        pb.setLayout(new FlowLayout());
        calculate = new JButton("Calcular");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        title = new JLabel("GANADOR DE LA COPA");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        place1 = new JLabel("1er Lugar");
        place2 = new JLabel("2do Lugar");
        place3 = new JLabel("3er Lugar");
        pedro = new JLabel("Pedro");
        juan = new JLabel("Juan");
        patricio = new JLabel("Patricio");
        points1 = new JLabel("10pts.");
        points2 = new JLabel("5pts.");
        points3 = new JLabel("7pts.");
        pointsPedro = new JLabel("Ingrese los puntos para Pedro");
        pointsJuan = new JLabel("Ingrese los puntos para Juan");
        pointsPatricio = new JLabel("Ingrese los puntos para Patricio");
        place1Text = new JTextField();
        place2Text = new JTextField();
        place3Text = new JTextField();
        pointsPedroText = new JTextField();
        pointsJuanText = new JTextField();
        pointsPatricioText = new JTextField();
        pb.add(calculate);
        pb.add(title);
        pb.add(place1);
        pb.add(place2);
        pb.add(place3);
        pb.add(pedro);
        pb.add(juan);
        pb.add(patricio);
        pb.add(points1);
        pb.add(points2);
        pb.add(points3);
        pb.add(pointsPedro);
        pb.add(pointsJuan);
        pb.add(pointsPatricio);
        pb.add(place1Text);
        pb.add(place2Text);
        pb.add(place3Text);
        pb.add(pointsPedroText);
        pb.add(pointsJuanText);
        pb.add(pointsPatricioText);
        panel.add(pb);
        pack(); // Ajustar el tamaño de la ventana
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
             
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
           getContentPane().setLayout(layout);
           layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                   .addGap(72, 72, 72)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                               .addComponent(pedro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(juan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(patricio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                           .addGap(18, 18, 18)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addGroup(layout.createSequentialGroup()
                                   .addComponent(points1)
                                   .addGap(18, 18, 18)
                                   .addComponent(pointsPedro)
                                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                   .addComponent(pointsPedroText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGroup(layout.createSequentialGroup()
                                   .addComponent(points2)
                                   .addGap(18, 18, 18)
                                   .addComponent(pointsJuan)
                                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                   .addComponent(pointsJuanText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGroup(layout.createSequentialGroup()
                                   .addComponent(points3)
                                   .addGap(18, 18, 18)
                                   .addComponent(pointsPatricio)
                                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                   .addComponent(pointsPatricioText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                       .addGroup(layout.createSequentialGroup()
                           .addComponent(place1)
                           .addGap(18, 18, 18)
                           .addComponent(place1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGroup(layout.createSequentialGroup()
                           .addComponent(place2)
                           .addGap(18, 18, 18)
                           .addComponent(place2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGroup(layout.createSequentialGroup()
                           .addComponent(place3)
                           .addGap(18, 18, 18)
                           .addComponent(place3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addContainerGap(145, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                   .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(title)
                   .addGap(266, 266, 266))
               .addGroup(layout.createSequentialGroup()
                   .addContainerGap()
                   .addComponent(calculate)
                   .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           );
           layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                   .addGap(40, 40, 40)
                   .addComponent(title)
                   .addGap(77, 77, 77)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(pedro)
                       .addComponent(points1)
                       .addComponent(pointsPedro)
                       .addComponent(pointsPedroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(18, 18, 18)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(juan)
                       .addComponent(points2)
                       .addComponent(pointsJuan)
                       .addComponent(pointsJuanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(18, 18, 18)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(patricio)
                       .addComponent(points3)
                       .addComponent(pointsPatricio)
                       .addComponent(pointsPatricioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(18, 18, 18)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(place1)
                       .addComponent(place1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(18, 18, 18)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(place2)
                       .addComponent(place2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(18, 18, 18)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(place3)
                       .addComponent(place3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                   .addComponent(calculate)
                   .addGap(25, 25, 25))
           );
           pack();

    }
    
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double pointsPatricio;
        double pointsJuan;
        double pointsPedro;
        double bonusPatricio = 7;
        double bonusJuan = 5;
        double bonusPedro = 10;

        pointsPatricio = Double.parseDouble(pointsPatricioText.getText());
        pointsJuan = Double.parseDouble(pointsJuanText.getText());
        pointsPedro = Double.parseDouble(pointsPedroText.getText());


        pointsPatricio += bonusPatricio;
        pointsJuan += bonusJuan;
        pointsPedro += bonusPedro;

        String place1;
        String place2;
        String place3;

        // Comparar puntos para determinar la posición de cada jugador
        if (pointsPatricio > pointsJuan && pointsPatricio > pointsPedro) {
            place1 = "Patricio";
            if (pointsJuan > pointsPedro) {
                place2 = "Juan";
                place3 = "Pedro";
            } else if (pointsPedro > pointsJuan) {
                place2 = "Pedro";
                place3 = "Juan";
            } else {
                place2 = "Empate";
                place3 = "Empate";
            }
        } else if (pointsJuan > pointsPatricio && pointsJuan > pointsPedro) {
            place1 = "Juan";
            if (pointsPatricio > pointsPedro) {
                place2 = "Patricio";
                place3 = "Pedro";
            } else if (pointsPedro > pointsPatricio) {
                place2 = "Pedro";
                place3 = "Patricio";
            } else {
                place2 = "Empate";
                place3 = "Empate";
            }
        } else if (pointsPedro > pointsPatricio && pointsPedro > pointsJuan) {
            place1 = "Pedro";
            if (pointsPatricio > pointsJuan) {
                place2 = "Patricio";
                place3 = "Juan";
            } else if (pointsJuan > pointsPatricio) {
                place2 = "Juan";
                place3 = "Patricio";
            } else {
                place2 = "Empate";
                place3 = "Empate";
            }
        } else {
            // Si hay empate entre los tres
            if (pointsPatricio == pointsJuan && pointsJuan == pointsPedro) {
                place1 = "Empate";
                place2 = "Empate";
                place3 = "Empate";
            } else {
                // Si hay empate entre dos jugadores
                if (pointsPatricio == pointsJuan) {
                    if (pointsPatricio > pointsPedro) {
                        place1 = "Patricio";
                        place2 = "Juan";
                        place3 = "Pedro";
                    } else {
                        place1 = "Pedro";
                        place2 = "Patricio";
                        place3 = "Juan";
                    }
                } else if (pointsPatricio == pointsPedro) {
                    if (pointsPatricio > pointsJuan) {
                        place1 = "Patricio";
                        place2 = "Pedro";
                        place3 = "Juan";
                    } else {
                        place1 = "Juan";
                        place2 = "Patricio";
                        place3 = "Pedro";
                    }
                } else { // pointsJuan == pointsPedro
                    if (pointsJuan > pointsPatricio) {
                        place1 = "Juan";
                        place2 = "Pedro";
                        place3 = "Patricio";
                    } else {
                        place1 = "Patricio";
                        place2 = "Juan";
                        place3 = "Pedro";
                    }
                }
            }
        }

        // Mostrar los resultados en los campos de texto correspondientes
        place1Text.setText(place1);
        place2Text.setText(place2);
        place3Text.setText(place3);
    }
    
    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaceWinner().setVisible(true);
            }
        });
    }
}


        
        

                
    
    
    

    
  
