  // 지도 생성
  const mapContainer = document.getElementById('map');
  const mapOption = {
    center: new kakao.maps.LatLng(33.450701, 126.570667),
    level: 4
  };
  const map = new kakao.maps.Map(mapContainer, mapOption);

  const marker = new kakao.maps.Marker({
    position: map.getCenter(),
    map: map
  });

  kakao.maps.event.addListener(map, 'click', function(mouseEvent) {
    const latlng = mouseEvent.latLng;
    marker.setPosition(latlng);
  });

  // 결함 선택 토글
  function selectChoice(el) {
    document.querySelectorAll('.choice').forEach(c => c.classList.remove('active'));
    el.classList.add('active');
  }