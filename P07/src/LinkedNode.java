
public class LinkedNode<T> {
	private T data;
	private LinkedNode<T> next;

	public LinkedNode(T data, LinkedNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public LinkedNode(T data) {
		this.data = data;
	}

	public LinkedNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedNode<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public String toString() {
		return data.toString() + (next == null ? "" : "->");
	}
}
