package Sessao_D_Oito.Aplicacao;

public class Estoque_Produto {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
}
