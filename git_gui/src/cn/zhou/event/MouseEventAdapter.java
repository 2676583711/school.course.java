package cn.zhou.event;

import java.awt.Component;
import java.awt.event.MouseEvent;

public class MouseEventAdapter extends MouseEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MouseEventAdapter(Component source, int id, long when, int modifiers, int x, int y, int clickCount,
			boolean popupTrigger) {
		super(source, id, when, modifiers, x, y, clickCount, popupTrigger);
		// TODO Auto-generated constructor stub
	}

	public MouseEventAdapter(Component source, int id, long when, int modifiers, int x, int y, int clickCount,
			boolean popupTrigger, int button) {
		super(source, id, when, modifiers, x, y, clickCount, popupTrigger, button);
		// TODO Auto-generated constructor stub
	}

	public MouseEventAdapter(Component source, int id, long when, int modifiers, int x, int y, int xAbs, int yAbs,
			int clickCount, boolean popupTrigger, int button) {
		super(source, id, when, modifiers, x, y, xAbs, yAbs, clickCount, popupTrigger, button);
		// TODO Auto-generated constructor stub
	}

}
