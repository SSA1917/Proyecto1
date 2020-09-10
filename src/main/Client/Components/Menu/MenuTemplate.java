
package main.Client.Components.Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.JPanel;
import main.Servicio.ObjGraficosService;
import main.Servicio.RecursosService;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class MenuTemplate extends  JPanel{
   
    private MenuComponent MenuComponent;
    private ObjGraficosService ObjGraficos;
    private RecursosService sRecursos;
    private JButton bBing,bHome,bsocial,bgames,btvmovies,bmusic,
            bapps,bsetting;
    private JPanel pCentro;
    
    //Decoradores
    private Font fontMenu;
    
    MenuTemplate(MenuComponent MenuComponent){
        
        this.MenuComponent = MenuComponent;
        this.ObjGraficos = ObjGraficosService.getService();
        this.sRecursos = RecursosService.getService();
        
        pCentro = ObjGraficos.construirJPanel((1000-880)/2,(65-50)/2,880,
                70, null);
        
        this.add(pCentro);
        this.Crearobjetosdecoradores();
        this.CrearJButtons();
        this.addMouseListener(MenuComponent);
        this.addMouseMotionListener((MouseMotionListener) MenuComponent);
       
        this.setLayout(null);
        this.setSize(1000,70);
        this.setLocation(0,0);
        this.setBackground(Color.GRAY);    
        this.setVisible(true);
       
        
    }
    
    public void Crearobjetosdecoradores(){
        
        fontMenu = new Font("Harrington",Font.PLAIN,20);
    }
    
    public void CrearJButtons(){
        /*(String Texto, int X,int Y,int Ancho
            ,int Largo, Color colorfondo,ImageIcon imagen ,
            Cursor cursor,Color colorfuente,boolean esSolido)*/
        
        bBing = new JButton();
        bBing = ObjGraficos.construirJButton("Bing",10,20,90,
                50, null, null,sRecursos.getCursorMano()
                ,Color.WHITE,fontMenu,false);
        bBing.addActionListener(MenuComponent);
        bBing.addMouseListener(MenuComponent);
        pCentro.add(bBing);
        //-----------------------------------------------------------------------------------------
        bHome = new JButton();
        bHome = ObjGraficos.construirJButton("Home",90+20,20,90,50,
                Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE, fontMenu,false);
        bHome.addActionListener(MenuComponent);
        bHome.addMouseListener(MenuComponent);
        pCentro.add(bHome);
        //----------------------------------------------------------------------
        //bsocial = new JButton();
        bsocial = ObjGraficos.construirJButton("Social",180+30,20,90,50,
                Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE,fontMenu ,false);
        bsocial.addActionListener(MenuComponent);
        bsocial.addMouseListener(MenuComponent);
        pCentro.add(bsocial);
        //-------------------------------------------------------
        bgames = new JButton();
        bgames = ObjGraficos.construirJButton("Games",270+40,20,100,50,
                Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE,fontMenu,false);
        bgames.addActionListener(MenuComponent);
        bgames.addMouseListener(MenuComponent);
        pCentro.add(bgames);
        //--------------------------------------------------------
        //btvmovies = new JButton();
        btvmovies = ObjGraficos.construirJButton("Tv&movies",370+50,
                20,130,50,Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE,fontMenu,false);
        btvmovies.addActionListener(MenuComponent);
        btvmovies.addMouseListener(MenuComponent);
        pCentro.add(btvmovies);
        //----------------------------------------------------------
        bmusic = new JButton();
        bmusic = ObjGraficos.construirJButton("Music",500+60,20,90,50,
                Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE,fontMenu,false);
        bmusic.addActionListener(MenuComponent);
        bmusic.addMouseListener(MenuComponent);
        pCentro.add(bmusic);
        ///------------------------------------------------------
        bapps = new JButton();
        bapps = ObjGraficos.construirJButton("Apps",590+70,20,90,50,
                Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE,fontMenu,false);
        bapps.addActionListener(MenuComponent);
        bapps.addMouseListener(MenuComponent);
        pCentro.add(bapps);
        //---------------------------------------------------
        bsetting = new JButton();
        bsetting = ObjGraficos.construirJButton("Setting",680+80,20,110
                ,50,Color.WHITE, null,sRecursos.getCursorMano(),
                Color.WHITE,fontMenu,false);
        bsetting.addActionListener(MenuComponent);
        bsetting.addMouseListener(MenuComponent);
        pCentro.add(bsetting);
    }
    
    /*bHome,bsocial,bgames,btvmovies,bmusic,
            bapps,bsetting
    */
   
    
}
