package tf.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.Label;
import com.vaadin.annotations.Theme;

/**
 * @author taskleron  6/18/13.
 */
@Theme("TF")
public class TFUI extends UI{
	
	@Override
	protected void init(VaadinRequest request){


		setContent(new Button("TestMe!"));
	}
}
