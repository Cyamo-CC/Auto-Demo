package auto;

public enum EnumAutoFactory {
	S�HK� {
		@Override
		Auto createAuto(){
			return new S�HK�();
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
