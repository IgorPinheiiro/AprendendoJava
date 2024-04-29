
	public class Convidado implements Sitio{
		
		@Override
		public void principal() {
			System.out.println("acesso comum");
		}
		@Override
		public void painelAdm() {
			System.out.println("não possui acesso");
		}
		@Override
		public void dashboard() {
			System.out.println("não possui acesso");
		}

	}

