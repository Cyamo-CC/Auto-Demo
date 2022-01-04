package auto;

public enum EnumAutoFactory {
	SÄHKÖ {
		@Override
		Auto createAuto(){
			return new SÄHKÖ();
		}
	},
	BENSIINI{
		@Override
		Auto createAuto(){
			return new BENSIINI();
		}
	},
	DIESEL {
		@Override
		Auto createAuto(){
			return new DIESEL();
		}
	}
	;
	abstract Auto createAuto();
}
