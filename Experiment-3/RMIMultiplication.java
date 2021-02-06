import java.rmi.*;

public interface Multiplication extends Remote {
	//declaring abstract method
	public int multiply(int a,int b) throws RemoteException;
}