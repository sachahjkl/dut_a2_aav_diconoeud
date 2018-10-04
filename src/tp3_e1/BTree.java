package tp3_e1;

interface BTree{

  boolean isEmpty();
  /* accesseur : renvoie vrai si l'arbre ne contient aucun element */

  BTree getRoot() throws Exception;
  /* accesseur : renvoie la racine de l'arbre */
	
  int getValue() throws Exception;
  /* accesseur : renvoie la valeur contenue a la racine de l'arbre */

  BTree getLeftTree() throws Exception;
  /* accesseur : renvoie le sous-arbre gauche de l'arbre */

  BTree getRightTree() throws Exception;
  /* accesseur : renvoie le sous-arbre droit de l'arbre */

  int getLeftValue() throws Exception;
  /* accesseur : renvoie la valeur a la racine du sous-arbre gauche */

  int getRightValue() throws Exception;
  /* accesseur : renvoie la valeur a la racine du sous-arbre droit */

  void setLeftTree(BTree leftTree) throws Exception;
  /* modificateur : ajoute un sous-arbre gauche a la racine de l'arbre (si libre) */

  void setRightTree(BTree rightTree) throws Exception;
  /* modificateur : ajoute un sous-arbre droit a la racine de l'arbre (si libre) */

  void setLeftValue(int leftSubRoot) throws Exception;
  /* modificateur : ajoute une valeur en fils gauche de la racine (si libre) */
  
  void setRightValue(int rightSubRoot) throws Exception;
  /* modificateur : ajoute une valeur en fils droit de la racine (si libre) */
  
}
