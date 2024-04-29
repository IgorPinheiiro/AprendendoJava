
	public class Adm implements Sitio{
		
		@Override
		public void principal() {
			System.out.println("acesso comum");
		}
		@Override
		public void painelAdm() {
			System.out.println("possui acesso");
		}
		@Override
		public void dashboard() {
			System.out.println("possui acesso");
		}

	}

