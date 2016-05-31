
//--------------------------This is the main class where the vertices are assigned their places and graph is built-------
import java.awt.Color;  
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
//-----------------Variable declaration
	String Source;
    String Distenation;
    Vertices newSource;
    Vertices newDistenation;
    static int count=0;
   
    int i=0;
//------------------Initializing the vertices needed(20 vertices plus one left empty--------------------------------
	static Vertices places[]=new Vertices[21];
	static Vertices v;
	

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    private void initComponents() {
    //---------------The rest of variable declarations
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        label20 = new java.awt.Label();
        labelR = new java.awt.Label();
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
     
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton4 = new javax.swing.JButton();
        clear    = new javax.swing.JButton();
         setTitle("جامعة بيرزيت");
        setBackground(java.awt.Color.CYAN);
        setForeground(java.awt.Color.CYAN);

        jPanel1.setLayout(null);
//=------------------------Setting up labels and their locations------------------------------
        label1.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label1.setName("كلية التكنولوجيا"); // NOI18N
        label1.setText("كلية التكنولوجيا");
        label1.setVisible(true);
        jPanel1.add(label1);
        label1.setBounds(480, 130, 84, 30);

        label2.setFont(new java.awt.Font("Dialog", 3, 14)); 
        label2.setName("مركز نجاد زعني"); 
        label2.setText("مركز نجاد زعني");
        label2.setVisible(true);
        jPanel1.add(label2);
        label2.setBounds(560, 180, 75, 30);

        label3.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label3.setName("كلية التربية"); 
        label3.setText("كلية التربية");
        label3.setVisible(true);
        jPanel1.add(label3);
        label3.setBounds(640, 265, 76, 20);

        label4.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label4.setName("مبني الرئاسة"); 
        label4.setText("مبني الرئاسة");
        label4.setVisible(true);
        jPanel1.add(label4);
        label4.setBounds(900, 325, 79, 20);

        label5.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label5.setName("كلية الحقوق"); 
        label5.setText("كلية الحقوق ");
        label5.setVisible(true);
        jPanel1.add(label5);
        label5.setBounds(850, 440, 80, 20);

        label6.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label6.setName("المكتبة الرئيسية"); 
        label6.setText("المكتبة الرئيسية");
        label6.setVisible(true);
        jPanel1.add(label6);
        label6.setBounds(966, 395, 85, 20);

        label7.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label7.setName("كلية الهندسة"); 
        label7.setText("كلية الهندسة");
        label7.setVisible(true);
        jPanel1.add(label7);
        label7.setBounds(835, 670, 80, 20);

        label8.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label8.setName("كلية العلوم"); 
        label8.setText("كلية العلوم");
        label8.setVisible(true);
        jPanel1.add(label8);
        label8.setBounds(1080, 590, 60, 20);

        label9.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label9.setName("كلية التجارة"); 
        label9.setText("كلية التجارة");
        label9.setVisible(true);
        jPanel1.add(label9);
        label9.setBounds(1100, 325, 70, 20);

        label10.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label10.setName("كلية الرياضة"); 
        label10.setText("كلية الرياضة");
        label10.setVisible(true);
        jPanel1.add(label10);
        label10.setBounds(515, 520, 71, 20);

        label11.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label11.setName("كلية التمريض"); 
        label11.setText("كلية التمريض");
        label11.setVisible(true);
        jPanel1.add(label11);
        label11.setBounds(350, 360, 75, 20);

        label12.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label12.setName("كلية الآداب");
        label12.setText("كلية الآداب");
        label12.setVisible(true);
        jPanel1.add(label12);
        label12.setBounds(625, 385, 72, 20);

        label13.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label13.setName("كلية المرأة"); 
        label13.setText("كلية المرأة");
        label13.setVisible(true);
        jPanel1.add(label13);
        label13.setBounds(540, 340, 63, 20);

        label14.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label14.setName("كلية الإعلام"); 
        label14.setText("كلية الإعلام");
        label14.setVisible(true);
        jPanel1.add(label14);
        label14.setBounds(460, 275, 63, 20);

        label15.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label15.setName("كلية التنمية "); 
        label15.setText("كلية التنمية ");
        label15.setVisible(true);
        jPanel1.add(label15);
        label15.setBounds(546, 285, 62, 20);
        jScrollPane1.setViewportView(labelR);

        label16.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label16.setName("حديقة سمير عويضة"); 
        label16.setText("حديقة سمير عويضة");
        label16.setVisible(true);
        jPanel1.add(label16);
        label16.setBounds(680, 460, 100, 20);

        label17.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label17.setName("المدخل الغربي"); 
        label17.setText("المدخل الغربي");
        label17.setVisible(true);
        jPanel1.add(label17);
        label17.setBounds(1050, 710, 75, 20);

        label18.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label18.setName("المدخل الشرقي"); 
        label18.setText("المدخل الشرقي");
        label18.setVisible(true);
        jPanel1.add(label18);
        label18.setBounds(1300, 90, 75, 20);

        label19.setFont(new java.awt.Font("Dialog", 3, 12));
        label19.setName("الكافيتيريا الرئيسية"); 
        label19.setText("الكافيتيريا الرئيسية");
        label19.setVisible(true);
        jPanel1.add(label19);
        label19.setBounds(790, 510, 98, 20);

        label20.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label20.setName("قاعة كمال ناصر"); 
        label20.setText("قاعة كمال ناصر");
        label20.setVisible(true);
        jPanel1.add(label20);
        label20.setBounds(966, 495, 88, 20);
//--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
       
        jLabel1.setIcon(new javax.swing.ImageIcon("./bzu.jpg")); 
        jLabel1.setText("jLabel1");
   
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 800);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel2.setText("المصدر:");

        jComboBox1.setBackground(java.awt.Color.gray);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jComboBox1.setMaximumRowCount(25);
        //--------------adding the labels to the combo boxes----------------------------------------
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"من",label1.getName(),label2.getName(),label3.getName(),
        		label4.getName(),label5.getName(),label6.getName(),label7.getName(), label8.getName(),label9.getName(),label10.getName(),
        		label11.getName(),label12.getName(),label13.getName(),label14.getName(),label15.getName(),label16.getName(),label17.getName() 
        		,label18.getName(),label19.getName(),label20.getName()}));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel3.setText("الهدف: ");

        jComboBox2.setBackground(java.awt.Color.gray);
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jComboBox2.setMaximumRowCount(25);
        
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "إلى",label1.getName(),label2.getName(),label3.getName(),label4.getName(),
        		label5.getName(),label6.getName() ,label7.getName(), label8.getName(),label9.getName(),label10.getName(),label11.getName(),label12.getName(),
        		label13.getName(),label14.getName(),label15.getName(),label16.getName(),label17.getName(),label18.getName(),label19.getName(),label20.getName() }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setText("المسار :");
//-------------------------setting up the buttons and their functions------------------------------------------
        jTextArea1.setColumns(30);
        jTextArea1.setRows(19);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(java.awt.Color.CYAN);
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jButton1.setText("جد الطريق");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel5.setText("المسافة :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        
        clear.setBackground(java.awt.Color.CYAN);
        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        clear.setText("محو");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jTextField1.setText(" ");
            	jTextArea1.setText(" ");
            	
            }
        });


        
       
        jButton4.setBackground(java.awt.Color.CYAN);
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jButton4.setText("خروج");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                        //----------------clear added here
                                .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            
                        		))))
        
        		
        		);
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGap(152, 152, 152)
                .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                
            		)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addContainerGap())
                    .addComponent(jScrollPane2)))
        );

        pack();
    }                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
    	jTextArea1.setText(null);
    	
    	
    	Source=null;
    	Source= jComboBox1.getSelectedItem().toString();
    	Distenation=jComboBox2.getSelectedItem().toString();
    	
    	//this for loop to get the city(vertex) name
         for (int i=0 ;i<places.length-1;i++)
    	        {
        	
    	           if( places[i].name.equals((Source)))
    	        		  
    	        	   newSource=places[i];
             
    	          
    	           if(places[i].name.equals((Distenation)))
    	            {
    	             	    
    	        	   newDistenation=places[i];
	             	   
    	           }
    	        }
    	        
    	       if(newSource==null || newDistenation==null)
    	       {
    	
    	    	   JOptionPane.showMessageDialog(null,"الرجاء اختيار المكان");
    	       }
    	      
    	
               //this method to find paths
    	       Dijkstra.findPaths(newSource);
			// here we find the shortest one
			    List<Vertices> path = v.getShortestPathTo(newDistenation);
			    
			 jTextField1.setText(newDistenation.minDistance + "  "+"متر");
			 for(int k=0;k<path.size();++k){
				 jTextArea1.append(path.get(k).getName());
				 jTextArea1.append("\n");
			 }
			 newSource=null;
			 //------------------Drawing the line from source all the way to destination------------------------------------------------
			for (int j=0;j<path.size()-1;j++){
				Graphics  g=jPanel1.getGraphics().create(); 
				g.setColor(Color.BLACK);
				g.drawLine(path.get(j).getX(), path.get(j).getY(), path.get(j+1).getX(), path.get(j+1).getY());
			  
			    
			}
		
		    	path.clear();
		    	
		
		    	
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }  
   
    private static void Initial() {
		 
		 for(int i=0;i<places.length-1;i++)
				places[i]=new Vertices();
		 
		
		 places[0].setName("كلية التكنولوجيا");
	
		 places[0].setDim(480,140);
		 places[0].placesadj = new Edges[]{ new Edges(places[0], 0),
                new Edges(places[10], 230),
                 new Edges(places[1], 40)
		        , new Edges(places[13], 136)
		 
		 };
		 
		 places[1].setName("مركز نجاد زعني");
		 places[1].setDim(560,180);
		 places[1].placesadj= new Edges[]{ new Edges(places[1], 0),
                new Edges(places[0], 40),
                new Edges(places[2], 55),
                new Edges(places[13], 100),
    	 
		 };
		 
		 
		 places[2].setName("كلية التربية");
		 places[2].setDim(640,265);
		 places[2].placesadj = new Edges[]{ new Edges(places[2], 0),
                new Edges(places[1], 55),
                new Edges(places[3], 291),
                new Edges(places[4], 280),
                new Edges(places[11], 100),
                new Edges(places[12], 110),
                  
		 };
		
		 places[3].setName("مبني الرئاسة");
		 places[3].setDim(900, 325);
		 places[3].placesadj= new Edges[]{new Edges(places[3], 0),
				 new Edges(places[2], 291),
                new Edges(places[4], 90),
             
		 };
		 
		 places[4].setName("كلية الحقوق");
		 places[4].setDim(850, 440);
		 places[4].placesadj = new Edges[]{new Edges(places[4], 0), 
		
			    new Edges(places[2], 280),
                new Edges(places[3], 90),
                new Edges(places[18], 60)
		       ,new Edges(places[5], 180)
	           ,new Edges(places[6], 222)
               ,new Edges(places[8], 295)
               ,new Edges(places[19], 91)
		       ,new Edges(places[15], 133)
	           ,new Edges(places[17], 290)
	          
		 };
		 
		 places[5].setName("المكتبة الرئيسية");
		 places[5].setDim(966, 395);
		 places[5].placesadj = new Edges[]{ new Edges(places[5], 0),
		            new Edges(places[4], 180),
		            new Edges(places[7], 201),
		            new Edges(places[8], 100),
			           
		 };
		 
		 places[6].setName("كلية الهندسة");
		 places[6].setDim(835, 670);
		 places[6].placesadj = new Edges[]{ new Edges(places[6], 0),
		 
			      new Edges(places[4], 222),
		          new Edges(places[7], 150)
                 ,new Edges(places[16], 82)
                 ,new Edges(places[9], 330)
		          ,new Edges(places[18], 153)
                   ,new Edges(places[19], 120)
				 
		 
		 };
		 
		 
		 places[7].setName("كلية العلوم");
		 places[7].setDim(1080, 590);
		 places[7].placesadj = new Edges[]{ new Edges(places[7], 0),
		            new Edges(places[6], 150),
		            new Edges(places[16], 115)
                    ,new Edges(places[8], 240)
                      ,new Edges(places[5], 201)
		 
		 
		 };
		 
		 places[8].setName("كلية التجارة");
		 places[8].setDim(1100, 325);
		 places[8].placesadj = new Edges[]{ new Edges(places[8], 0),
	              new Edges(places[7], 240),
	              new Edges(places[4], 295),
	              new Edges(places[5], 100)
                  ,new Edges(places[17], 223)
			
		 
		 };
		 
		 places[9].setName("كلية الرياضة");
		 places[9].setDim(515, 520);
		 places[9].placesadj = new Edges[]{ new Edges(places[9], 0),
		            new Edges(places[6], 330),
		            new Edges(places[10], 270),
		            new Edges(places[11], 90),
		            new Edges(places[15], 120),
		            		            
		         };
		 
		 places[10].setName("كلية التمريض");
		 places[10].setDim(350, 360);
		 places[10].placesadj = new Edges[]{ new Edges(places[10], 0),
		            new Edges(places[9], 270),
		            new Edges(places[0], 230),
		            new Edges(places[11], 208),
		            new Edges(places[13], 110),
		            new Edges(places[12], 160),
				            
			              
		            };
		 places[11].setName("كلية الآداب");
		 places[11].setDim(625, 385);
		 places[11].placesadj = new Edges[]{ new Edges(places[11], 0),
		            new Edges(places[10], 208),
		            new Edges(places[12], 35),
		            new Edges(places[15], 77),
		            new Edges(places[2], 100),
		            
		         };
			

		 places[12].setName("كلية المرأة");
		 places[12].setDim(540, 340);
		 places[12].placesadj = new Edges[]{ new Edges(places[12], 0),
		            new Edges(places[11], 35),
		            new Edges(places[10], 160),
		            new Edges(places[13], 60),
		            new Edges(places[14], 29),
		            
		          };
		 
		 places[13].setName("كلية الإعلام");
		 places[13].setDim(460, 275);
		 places[13].placesadj = new Edges[]{ new Edges(places[13], 0),
		            new Edges(places[12], 60),
		            new Edges(places[14], 33),
		            new Edges(places[10], 110),
		            new Edges(places[0], 136),
		            new Edges(places[1], 100),
		            
		            };
		 
		 places[14].setName("كلية التنمية");
		 places[14].setDim(546, 285);
		 places[14] .placesadj = new Edges[]{ new Edges(places[14], 0),
		            new Edges(places[13], 33),
		            new Edges(places[12], 29),
		            
		           };
		 
		 places[15].setName("حديقة سمير عويضة");
		 places[15].setDim(680, 460);
		 places[15] .placesadj = new Edges[]{ new Edges(places[15], 0),
		            new Edges(places[11], 77),
		            new Edges(places[9], 120),
		            new Edges(places[18], 113),
		            new Edges(places[4], 133),
			           
		           };
		 
		 places[16].setName("المدخل الغربي");
		 places[16].setDim(1050, 710);
		 places[16] .placesadj = new Edges[]{ new Edges(places[16], 0),
		            new Edges(places[6], 82),
		            new Edges(places[7],115),
		                 };
		
		 places[17].setName("المدخل الشرقي");
		 places[17].setDim(1300, 90);
		 places[17] .placesadj = new Edges[]{ new Edges(places[17], 0),
		            new Edges(places[8], 223),
		            new Edges(places[19], 20),
		            new Edges(places[4], 290),
		            
		        
		 };
		
		 places[18].setName("الكافتيريا الرئيسية");
		 places[18].setDim(790, 510);
		 places[18] .placesadj = new Edges[]{
				 new Edges(places[18], 0),
		            new Edges(places[4], 60),
		            new Edges(places[15], 113),
		            new Edges(places[6], 153),
				    
		           };
		 
		 places[19].setName("قاعة كمال ناصر");
		 places[19].setDim(966, 495);
		 places[19] .placesadj = new Edges[]{ new Edges(places[19], 0),
		            new Edges(places[4], 91),
		            new Edges(places[6], 120),
		 
		 };   
		 
	 }
  //--------------------------------Variable declaration + look and feel info------------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	Initial();
      
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    

    // Variables declaration                      
    private javax.swing.JButton jButton1;
    
    private javax.swing.JButton jButton4, clear;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Label labelR;
    
    // End of variables declaration                   
}
