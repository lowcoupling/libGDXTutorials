package lowcoupling.testGdx;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private OrthogonalTiledMapRenderer mapRenderer;
    private TiledMap map;	     
	@Override
	public void create() {		

		Texture.setEnforcePotImages(false);
	     map = new TmxMapLoader().load("data/desert.tmx");
	     mapRenderer = new OrthogonalTiledMapRenderer(map);
		 camera = new OrthographicCamera();
		TestInputProcessor ip = new TestInputProcessor(camera);
		Gdx.input.setInputProcessor(ip);;
		camera.position.y=700;
		camera.position.x=300;
	}
	@Override
	public void dispose() {
		mapRenderer.dispose();
		map.dispose();
	}
	@Override
	public void render() {		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapRenderer.setView(camera);
		mapRenderer.render();
	}
	@Override
	public void resize(int width, int height) {
		camera.viewportHeight = height;
		camera.viewportWidth = width;
		
		camera.update();
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
