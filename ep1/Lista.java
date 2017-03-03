class No {
	private int x;
	private No prox,ant;
	public No() {
		this.x = 0;
		this.prox = null;
		this.ant = null;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	public void setAnt(No ant) {
		this.ant = ant;
	}
	public void setX(int x) {
		this.x = x;
	}
	public  int getX(){
		return this.x;
	}
	public No getProx(){
	return this.prox;
	}
	public No getAnt(){
	return this.ant;
	}
}		

public class Lista{
	private No cabeca;
	private int tam;

	public Lista(){ 
		this.tam=0;
		this.cabeca=null;
	}

	public boolean Pesquisar(int item){
		No cursor= this.cabeca;
		for(int i=0;i<tam;i++){
			if(cursor.getX()==item){
			return true;
			}
		cursor=cursor.getProx();
		}
		return false;
	}
	public void Inserir(int item){
		if (tam==0){
			this.cabeca=new No();
			this.cabeca.setX(item);
			tam++;
		}else{
			No antes=this.cabeca;
			No aux=new No();
			while (antes.getProx() != null){
				antes=antes.getProx();
			}
		aux.setX(item);
		aux.setAnt(antes);
		antes.setProx(aux);
		tam++;
		}
	}

	public void Remover(){
		No aux=this.cabeca;
		while(aux.getProx() !=null){
			aux=aux.getProx();
		}
		aux.getAnt().setProx(null);
		aux.setAnt(null);
	tam--;
	}
}
