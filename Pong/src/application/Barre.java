package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Modèle des barres du jeu de Pong, fondamentalement des rectangles
 */
public class Barre extends Rectangle{

	int posX; //Position en abscisse
	int posY; //Position en ordonnée
	int width; //largeur
	int height; //hauteur
	
	Color fill; //Couleur de l'intérieur de la barre
	Color contour; //Couleur du contour
	
	public Barre(int posX, int posY, int width, int height, Color fill, Color contour) {
		super();
		this.setWidth(width);
		this.setHeight(height);
		this.setX(posX);
		this.setY(posY);
		this.setFill(fill);
		this.setStroke(contour);
	}

		
}
