package aurelienribon.bodyeditor.models;

import com.badlogic.gdx.math.Vector2;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class ShapeModel {
	public enum Type {POLYGON, CIRCLE}

    private final List<ShapeVertice> vertices = new ArrayList<ShapeVertice>();
	private final Type type;
	private boolean isClosed = false;

	public ShapeModel(Type type) {
		this.type = type;
	}
	
	public List<ShapeVertice> getDetailVertices() {
		return vertices;
	}
	
	private List<Vector2> detailVerticesToVertices() {
		List<Vector2> retList = new ArrayList<>();
		for(ShapeVertice dVertice : vertices) {
			retList.add(dVertice.vertex);
		}
		
		return retList;
	}
	
	public List<Vector2> getVertices() {
		return detailVerticesToVertices();
	}

	public Type getType() {
		return type;
	}

	public void close() {
		isClosed = true;
	}

	public boolean isClosed() {
		return isClosed;
	}
}
