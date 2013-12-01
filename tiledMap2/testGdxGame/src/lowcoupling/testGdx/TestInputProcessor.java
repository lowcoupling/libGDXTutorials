package lowcoupling.testGdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class TestInputProcessor implements InputProcessor {
	
     	   private OrthographicCamera camera;

		public TestInputProcessor(OrthographicCamera cam) {
		// TODO Auto-generated constructor stub
     		   this.camera=cam;
	}

		@Override
		   public boolean keyDown (int keycode) {
			int yoffset=0;
			int xoffset=0;
			if(keycode==19){
				yoffset=20;
			}else if(keycode==20){
				yoffset=-20;
			}else if (keycode==21){
				xoffset=-20;
			}else if (keycode==22){
				xoffset=20;
			}
			camera.position.y+=yoffset;
			camera.position.x+=xoffset;
			
			camera.viewportHeight = Gdx.graphics.getHeight();;
			camera.viewportWidth = Gdx.graphics.getWidth();;
			camera.update();
		      return false;
		   }

		   @Override
		   public boolean keyUp (int keycode) {
		      return false;
		   }

		   @Override
		   public boolean keyTyped (char character) {
		      return false;
		   }

		   @Override
		   public boolean touchDown (int x, int y, int pointer, int button) {
		      return false;
		   }

		   @Override
		   public boolean touchUp (int x, int y, int pointer, int button) {
		      return false;
		   }

		   @Override
		   public boolean touchDragged (int x, int y, int pointer) {
		      return false;
		   }

		   public boolean touchMoved (int x, int y) {
		      return false;
		   }

		   @Override
		   public boolean scrolled (int amount) {
		      return false;
		   }

		@Override
		public boolean mouseMoved(int screenX, int screenY) {
			// TODO Auto-generated method stub
			return false;
		}

}
