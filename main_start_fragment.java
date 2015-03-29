	public void start()
	{
		if (current != null)
		{
			current.show();
			return;
		}
		Form hi = new Form("Basic memory leakage test");
		Container mainContainer = hi.getContentPane();
		BorderLayout layout = new BorderLayout();
		mainContainer.setLayout(layout);
		mainContainer.setScrollableX(false);
		mainContainer.setScrollableY(false);
		mainContainer.setTensileDragEnabled(false);
		mainContainer.setAlwaysTensile(false);
		mainContainer.addComponent(BorderLayout.CENTER, new VertIC());
		hi.show();
	}